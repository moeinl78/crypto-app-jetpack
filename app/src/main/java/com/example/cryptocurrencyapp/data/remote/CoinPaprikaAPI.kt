package com.example.cryptocurrencyapp.data.remote

import com.example.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.example.cryptocurrencyapp.data.remote.dto.CoinsDto
import com.example.cryptocurrencyapp.domain.model.CoinDetail
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaAPI {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinsDto>

    @GET("v1/coin/{coinId}")
    suspend fun getCoin(
        @Path("coinId") coinId: String
    ): CoinDetailDto
}