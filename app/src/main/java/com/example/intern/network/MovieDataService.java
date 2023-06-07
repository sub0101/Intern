package com.example.intern.network;

//import com.example.intern.models.Result;
import com.example.intern.models.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {

    // Base Url
    // https://api.themoviedb.org/3/
    //
    // End Point Url
    // movie/popular?api_key=ca175d6f7d1723928f4ad01eb93617a4
    @GET("movie/now_playing")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);

}
