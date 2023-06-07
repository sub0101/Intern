package com.example.intern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.example.intern.databinding.ActivityMovieDetailBinding;
import com.example.intern.models.Movie;

public class MovieDetail extends AppCompatActivity {

    ActivityMovieDetailBinding detailBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        detailBinding = DataBindingUtil.setContentView(this , R.layout.activity_movie_detail);
        Intent intent  = getIntent();
        Movie movie = intent.getParcelableExtra("movie_detail");
        System.out.println(movie.getTitle());
        detailBinding.setMovie(movie);


    }
}