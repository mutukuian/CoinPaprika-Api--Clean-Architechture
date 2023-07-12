package com.example.cleanarchitecture.domain.repository

import com.example.cleanarchitecture.data.remote.dto.CoinDetailDto
import com.example.cleanarchitecture.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String):CoinDetailDto
}