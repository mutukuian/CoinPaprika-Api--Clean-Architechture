package com.example.cleanarchitecture.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cleanarchitecture.presentation.coin_detail.components.CoinDetailScreen
import com.example.cleanarchitecture.presentation.coin_list.CoinListScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   val navController = rememberNavController()

               NavHost(
                   navController = navController,
                   startDestination = ScreenRoutes.CoinListScreen.route
               ){
                   composable(
                       route = ScreenRoutes.CoinListScreen.route
                   ){
                      CoinListScreen(navController)
                   }
                   composable(
                       route = ScreenRoutes.CoinDetailScreen.route + "/{coinId}"
                   ){
                      CoinDetailScreen()
                   }

               }
                }
            }
    }
}

