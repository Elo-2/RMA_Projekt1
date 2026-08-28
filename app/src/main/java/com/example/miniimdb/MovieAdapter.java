package com.example.miniimdb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private final List<Movie> movieList;
    private final OnMovieClickListener listener;

    public interface OnMovieClickListener {
        void onMovieClick(Movie movie);
    }

    public MovieAdapter(List<Movie> movieList, OnMovieClickListener listener) {
        this.movieList = movieList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent,
            int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_movie, parent, false);

        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(
            @NonNull MovieViewHolder holder,
            int position) {

        Movie movie = movieList.get(position);

        holder.movieTitle.setText(movie.getTitle());
        holder.movieGenre.setText(movie.getGenre());
        holder.movieRating.setText("⭐ " + movie.getRating());

        if (movie.getPosterResId() != 0) {
            holder.moviePoster.setImageResource(movie.getPosterResId());
        } else {
            holder.moviePoster.setImageResource(
                    R.drawable.ic_launcher_foreground
            );
        }

        holder.itemView.setOnClickListener(v -> {
            listener.onMovieClick(movie);
        });
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public static class MovieViewHolder
            extends RecyclerView.ViewHolder {

        ImageView moviePoster;
        TextView movieTitle;
        TextView movieGenre;
        TextView movieRating;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);

            moviePoster = itemView.findViewById(R.id.moviePoster);
            movieTitle = itemView.findViewById(R.id.movieTitle);
            movieGenre = itemView.findViewById(R.id.movieGenre);
            movieRating = itemView.findViewById(R.id.movieRating);
        }
    }
}