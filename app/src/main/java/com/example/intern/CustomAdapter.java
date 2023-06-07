package com.example.intern;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.intern.databinding.MovieListBinding;
import com.example.intern.models.Movie;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter< CustomAdapter.MovieViewHolder> {

private static List<Movie> movies;
static Context context;
MovieListBinding movieListBinding;
    public CustomAdapter(Context context, List<Movie> movies) {
        this.context = context;
        this.movies = movies;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        movieListBinding = DataBindingUtil.inflate(LayoutInflater.from(context) , R.layout.movie_list , parent , false);
        return new MovieViewHolder(movieListBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Movie movie = movies.get(position);
        holder.listBinding.setMovie(movie);


    }

    @Override
    public int getItemCount() {


        return movies.size();
    }
    public static class MovieViewHolder extends RecyclerView.ViewHolder
    {
        private MovieListBinding listBinding;

        public MovieViewHolder(@NonNull MovieListBinding itemView) {
            super(itemView.getRoot());

            listBinding = itemView;

listBinding.getRoot().setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Movie m = movies.get(getAdapterPosition());

        Intent intent = new Intent(context , MovieDetail.class);
        intent.putExtra("movie_detail" ,m);
        context.startActivity(intent);
    }
});
        }

    }

}
