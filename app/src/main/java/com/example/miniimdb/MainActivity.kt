package com.example.miniimdb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var searchEditText: EditText
    private lateinit var favoritesButton: Button
    private lateinit var adapter: MovieAdapter

    private val allMovies = MovieData.movies.toMutableList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        MovieStorage.loadMovieData(this)

        val toolbar = findViewById<Toolbar>(R.id.mainToolbar)
        setSupportActionBar(toolbar)

        recyclerView = findViewById(R.id.movieRecyclerView)
        searchEditText = findViewById(R.id.searchEditText)
        favoritesButton = findViewById(R.id.favoritesButton)

        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = MovieAdapter(allMovies) { movie ->

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

        recyclerView.adapter = adapter

        searchEditText.addTextChangedListener(
            object : android.text.TextWatcher {

                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                }

                override fun onTextChanged(
                    s: CharSequence?,
                    start: Int,
                    before: Int,
                    count: Int
                ) {
                    filterMovies(s.toString())
                }

                override fun afterTextChanged(
                    s: android.text.Editable?
                ) {
                }
            }
        )

        favoritesButton.setOnClickListener {

            val intent = Intent(
                this,
                FavoritesActivity::class.java
            )

            startActivity(intent)
        }
    }

    private fun filterMovies(query: String) {

        val filteredMovies = MovieData.movies.filter {

            it.title.contains(
                query,
                ignoreCase = true
            )
        }

        adapter = MovieAdapter(
            filteredMovies
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

        recyclerView.adapter = adapter
    }
}