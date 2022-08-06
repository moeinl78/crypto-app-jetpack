package com.example.cryptocurrencyapp.data.remote.dto

import com.example.cryptocurrencyapp.domain.model.Coins
import com.google.gson.annotations.SerializedName

data class CoinsDto(
    val id: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("is_new")
    val isNew: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
) {
    fun toItem(): Coins {
        return Coins(
            id = id,
            isActive = isActive,
            name = name,
            rank = rank,
            symbol = symbol
        )
    }
}