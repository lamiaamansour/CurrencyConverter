package com.example.data.remote.api

import com.example.data.remote.model.news.modle.Favorite
import com.example.data.remote.model.news.modle.NewFavorite
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {

    @GET("https://currency-converter-production-3e05.up.railway.app/api/currency-conversions/currencies\n")
    suspend fun getNews () : Favorite
}