package com.example.mysoothe.navigation

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mysoothe.ui.theme.Gray

@Composable
fun Navigation(navController: NavHostController) {
    var list = listOf(
        Screen.HomeScreen,
        Screen.ProfileScreen
    )
    BottomNavigation() {
        list.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(imageVector = item.icon, contentDescription = item.name) },
                label = { Text(text = item.name)},
                selectedContentColor = Color.Black,
                unselectedContentColor = Gray,
                alwaysShowLabel = true,
                selected = false,
                onClick = {
                    navController.navigate(item.route){
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route){
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }


}