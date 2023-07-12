package com.example.cleanarchitecture.presentation.coin_detail

import com.example.cleanarchitecture.domain.model.Coin
import com.example.cleanarchitecture.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
