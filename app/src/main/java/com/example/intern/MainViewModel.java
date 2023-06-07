package com.example.intern;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.intern.models.Movie;
import com.example.intern.models.MovieRepository;

import java.util.List;

public class MainViewModel extends AndroidViewModel {

    private MovieRepository movieRepository;

    public MainViewModel(@NonNull Application application) {
        super(application);
        movieRepository = new MovieRepository(application);
    }

    // Live Data
    public LiveData<List<Movie>> getAllMovies(){
        return movieRepository.getMutableLiveData();
    }

}
