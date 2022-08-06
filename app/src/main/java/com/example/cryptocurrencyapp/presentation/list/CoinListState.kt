package com.example.cryptocurrencyapp.presentation.list

import com.example.cryptocurrencyapp.domain.model.Coins

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coins> = emptyList(),
    val error: String = ""
)
