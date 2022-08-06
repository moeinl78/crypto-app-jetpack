package com.example.cryptocurrencyapp.domain.model

import com.example.cryptocurrencyapp.data.remote.dto.CoinDetailDto

data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<CoinDetailDto.TeamMember>
)
