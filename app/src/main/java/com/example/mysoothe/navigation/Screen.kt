package com.example.mysoothe.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String, val icon: ImageVector, val name: String) {
    object HomeScreen: Screen("home", Icons.Default.Favorite, "HOME")
    object ProfileScreen: Screen("profile", Icons.Default.Person, "PROFILE")
}
