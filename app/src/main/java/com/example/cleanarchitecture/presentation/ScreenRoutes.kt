package com.example.cleanarchitecture.presentation

sealed class ScreenRoutes(val route: String){
    object CoinListScreen: ScreenRoutes("coin_list_screen")
    object CoinDetailScreen: ScreenRoutes("coin_detail_screen")
}
