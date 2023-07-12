package com.example.cleanarchitecture.domain.model


import com.example.cleanarchitecture.data.remote.dto.TeamMember

data class CoinDetail(
    val id: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val is_active: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>
)
