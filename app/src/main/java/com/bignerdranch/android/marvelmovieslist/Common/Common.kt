package com.bignerdranch.android.marvelmovieslist.Common

import com.bignerdranch.android.marvelmovieslist.Interface.RetrofitServices
import com.bignerdranch.android.marvelmovieslist.Retrofit.RetrofitClient

object Common {
    private val BASE_URL = "https://www.simplifiedcoding.net/demos/"
    val retrofitService : RetrofitServices
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}