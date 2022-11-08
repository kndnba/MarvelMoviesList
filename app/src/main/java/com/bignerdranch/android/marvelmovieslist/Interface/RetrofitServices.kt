package com.bignerdranch.android.marvelmovieslist.Interface

import com.bignerdranch.android.marvelmovieslist.Model.Movie
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitServices {
    @GET("marvel")
    fun getMovieList(): Call<MutableList<Movie>>
}