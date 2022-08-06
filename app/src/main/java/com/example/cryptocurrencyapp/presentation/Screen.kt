package com.example.cryptocurrencyapp.presentation

sealed class Screen(val route: String) {
    object CoinsListScreen: Screen(route = "coins_list_screen")
    object CoinDetailScreen: Screen(route = "coin_detail_screen")
}
