package com.example.cryptocurrencyapp.presentation.detail

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import com.example.cryptocurrencyapp.common.Constants
import com.example.cryptocurrencyapp.domain.use_cases.get_coin.GetCoinUseCase
import com.example.cryptocurrencyapp.presentation.list.CoinListState
import javax.inject.Inject

class CoinDetailViewModel @Inject constructor(
    private val getCoinUseCase: GetCoinUseCase,
    private val savedStateHandle: SavedStateHandle
) {

    private val _state = mutableStateOf(CoinDetailState())

    val state: State<CoinDetailState>
        get() = _state

    init {
        savedStateHandle.get<String>(Constants.PARAM_COIN_ID)?.let { coinId ->
            getCoin(coinId)
        }
    }

    private fun getCoin(coinId: String) {
        getCoinUseCase(coinId)
    }
}