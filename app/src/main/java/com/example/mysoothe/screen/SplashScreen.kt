package com.example.mysoothe.screen

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mysoothe.navigation.Navigation
import com.example.mysoothe.navigation.Screen

@Composable
fun SplashScreen(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            Navigation(navController)
        }
    ) {

        NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
            composable(Screen.HomeScreen.route) {
                HomeScreen()
            }
            composable(Screen.ProfileScreen.route) {
                ProfileScreen()
            }
        }
    }
}