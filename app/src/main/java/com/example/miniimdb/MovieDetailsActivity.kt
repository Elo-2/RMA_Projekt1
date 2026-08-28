package com.example.miniimdb

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MovieDetailsActivity : AppCompatActivity() {

    private lateinit var detailPoster: ImageView
    private lateinit var detailTitle: TextView
    private lateinit var detailGenre: TextView
    private lateinit var detailRating: TextView
    private lateinit var detailDescription: TextView
    private lateinit var userRatingBar: RatingBar
    private lateinit var userRatingText: TextView
    private lateinit var favoriteButton: Button
    private lateinit var actorsRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_movie_details)

        val toolbar = findViewById<Toolbar>(
            R.id.detailsToolbar
        )

        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Movie Details"

        detailPoster = findViewById(R.id.detailPoster)
        detailTitle = findViewById(R.id.detailTitle)
        detailGenre = findViewById(R.id.detailGenre)
        detailRating = findViewById(R.id.detailRating)
        detailDescription = findViewById(R.id.detailDescription)
        userRatingBar = findViewById(R.id.userRatingBar)
        userRatingText = findViewById(R.id.userRatingText)
        favoriteButton = findViewById(R.id.favoriteButton)
        actorsRecyclerView = findViewById(R.id.actorsRecyclerView)

        val movieTitle = intent.getStringExtra(
            "movieTitle"
        )

        val movie = MovieData.movies.find {
            it.title == movieTitle
        }

        if (movie != null) {

            if (movie.posterResId != 0) {
                detailPoster.setImageResource(
                    movie.posterResId
                )
            }

            detailTitle.text = movie.title
            detailGenre.text = movie.genre

            detailRating.text =
                "⭐ ${movie.rating} / 10"

            detailDescription.text =
                movie.description

            userRatingBar.rating =
                movie.userRating

            updateUserRatingText(
                movie.userRating
            )

            updateFavoriteButton(
                movie.isFavorite
            )

            userRatingBar.setOnRatingBarChangeListener {
                    _,
                    rating,
                    fromUser ->

                if (fromUser) {

                    movie.userRating = rating

                    userRatingText.text =
                        "Your rating: ${rating.toInt()} / 5"

                    MovieStorage.saveMovieData(
                        this
                    )
                }
            }

            favoriteButton.setOnClickListener {

                movie.setFavorite(
                    !movie.isFavorite
                )

                updateFavoriteButton(
                    movie.isFavorite
                )

                MovieStorage.saveMovieData(
                    this
                )
            }

            actorsRecyclerView.layoutManager =
                LinearLayoutManager(
                    this,
                    LinearLayoutManager.HORIZONTAL,
                    false
                )

            actorsRecyclerView.adapter =
                ActorAdapter(movie.actors)
        }
    }

    private fun updateUserRatingText(
        rating: Float
    ) {

        if (rating > 0) {

            userRatingText.text =
                "Your rating: ${rating.toInt()} / 5"

        } else {

            userRatingText.text =
                "Not rated yet"
        }
    }

    private fun updateFavoriteButton(
        isFavorite: Boolean
    ) {

        if (isFavorite) {

            favoriteButton.text =
                "❤️ Remove from Favorites"

        } else {

            favoriteButton.text =
                "Add to Favorites"
        }
    }

    override fun onSupportNavigateUp(): Boolean {

        finish()

        return true
    }
}