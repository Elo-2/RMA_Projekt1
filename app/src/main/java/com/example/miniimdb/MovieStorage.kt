package com.example.miniimdb

import android.content.Context

object MovieStorage {

    private const val PREFS_NAME = "mini_imdb_preferences"

    fun saveMovieData(context: Context) {

        val preferences = context.getSharedPreferences(
            PREFS_NAME,
            Context.MODE_PRIVATE
        )

        val editor = preferences.edit()

        for (movie in MovieData.movies) {

            val key = movie.title

            editor.putBoolean(
                "${key}_favorite",
                movie.isFavorite
            )

            editor.putFloat(
                "${key}_rating",
                movie.userRating
            )
        }

        editor.apply()
    }

    fun loadMovieData(context: Context) {

        val preferences = context.getSharedPreferences(
            PREFS_NAME,
            Context.MODE_PRIVATE
        )

        for (movie in MovieData.movies) {

            val key = movie.title

            val favorite = preferences.getBoolean(
                "${key}_favorite",
                false
            )

            val rating = preferences.getFloat(
                "${key}_rating",
                0f
            )

            movie.setFavorite(favorite)
            movie.setUserRating(rating)
        }
    }
}