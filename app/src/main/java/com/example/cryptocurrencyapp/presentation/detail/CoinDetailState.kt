package com.example.cryptocurrencyapp.presentation.detail

import com.example.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail ?= null,
    val error: String = ""
)
