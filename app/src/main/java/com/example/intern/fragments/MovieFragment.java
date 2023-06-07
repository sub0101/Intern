package com.example.intern.fragments;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.intern.CustomAdapter;
import com.example.intern.MainViewModel;
import com.example.intern.models.Movie;
import com.example.intern.R;
import com.example.intern.databinding.FragmentMovieBinding;

import java.util.List;


public class MovieFragment extends Fragment {


MainViewModel viewModel;
CustomAdapter customAdapter;
RecyclerView recyclerView;
FragmentMovieBinding movieBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        movieBinding = DataBindingUtil.inflate(inflater , R.layout.fragment_movie , container , false );
//        return inflater.inflate(R.layout.fragment_movie, container, false);
        return movieBinding.getRoot();
    }


    @Override
    public void onStart() {
        super.onStart();
        loadData();
        System.out.println("started movie fragment");
    }


    void   loadData()
    {
        viewModel.getAllMovies().observe(this, new Observer<List<Movie>>() {
            @Override
            public void onChanged(List<Movie> movies) {
                System.out.println("obsered");
                show(movies);
            }
        });
    }
    void show(List<Movie> movies)
    {
        recyclerView  = movieBinding.movieRview;
        customAdapter = new CustomAdapter(getContext() ,movies );
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(customAdapter);

    }



}