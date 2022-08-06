package com.example.cryptocurrencyapp.domain.repository

import com.example.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.example.cryptocurrencyapp.data.remote.dto.CoinsDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinsDto>

    suspend fun getCoin(coinId: String): CoinDetailDto
}