package com.example.cleanarchitecture.domain.model

data class Coin(
    val id: String,
    val is_active: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,

    //https://api.coinpaprika.com/v1/coins/btc-bitcoin
)
