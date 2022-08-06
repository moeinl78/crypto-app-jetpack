package com.example.cryptocurrencyapp.domain.model


data class Coins(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)