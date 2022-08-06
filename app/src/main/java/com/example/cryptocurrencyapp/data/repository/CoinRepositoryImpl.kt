package com.example.cryptocurrencyapp.data.repository

import com.example.cryptocurrencyapp.data.remote.CoinPaprikaAPI
import com.example.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.example.cryptocurrencyapp.data.remote.dto.CoinsDto
import com.example.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaAPI
): CoinRepository {

    override suspend fun getCoins(): List<CoinsDto> {
        return api.getCoins()
    }

    override suspend fun getCoin(coinId: String): CoinDetailDto {
        return api.getCoin(coinId)
    }
}