package com.example.miniimdb

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FavoritesActivity : AppCompatActivity() {

    private lateinit var favoritesRecyclerView: RecyclerView
    private lateinit var emptyFavoritesText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_favorites)

        MovieStorage.loadMovieData(this)

        val toolbar = findViewById<Toolbar>(
            R.id.favoritesToolbar
        )

        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "❤️ Favorites"

        favoritesRecyclerView =
            findViewById(R.id.favoritesRecyclerView)

        emptyFavoritesText =
            findViewById(R.id.emptyFavoritesText)

        favoritesRecyclerView.layoutManager =
            LinearLayoutManager(this)

        loadFavorites()
    }

    override fun onResume() {
        super.onResume()

        if (::favoritesRecyclerView.isInitialized) {
            MovieStorage.loadMovieData(this)
            loadFavorites()
        }
    }

    private fun loadFavorites() {

        val favoriteMovies =
            MovieData.movies.filter {
                it.isFavorite
            }

        if (favoriteMovies.isEmpty()) {

            emptyFavoritesText.visibility =
                TextView.VISIBLE

            favoritesRecyclerView.visibility =
                RecyclerView.GONE

        } else {

            emptyFavoritesText.visibility =
                TextView.GONE

            favoritesRecyclerView.visibility =
                RecyclerView.VISIBLE

            favoritesRecyclerView.adapter =
                MovieAdapter(
                    favoriteMovies
                ) { movie ->

                    val intent = Intent(
                        this,
                        MovieDetailsActivity::class.java
                    )

                    intent.putExtra(
                        "movieTitle",
                        movie.title
                    )

                    startActivity(intent)
                }
        }
    }

    override fun onSupportNavigateUp(): Boolean {

        finish()

        return true
    }
}