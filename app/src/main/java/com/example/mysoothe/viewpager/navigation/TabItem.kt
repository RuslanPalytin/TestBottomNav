package com.example.mysoothe.viewpager.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.mysoothe.viewpager.screenviewpager.OneScreen
import com.example.mysoothe.viewpager.screenviewpager.ThirdScreen
import com.example.mysoothe.viewpager.screenviewpager.TwoScreen

typealias ComposableFun = @Composable () -> Unit

sealed class TabItem(val icon: ImageVector, val title: String, val screen: ComposableFun) {
    object OneScreen: TabItem(Icons.Default.LocationOn, "One", {OneScreen()})
    object TwoScreen: TabItem(Icons.Default.Person, "Two", { TwoScreen() })
    object ThirdScreen: TabItem(Icons.Default.AccountBox, "Third", { ThirdScreen() })
}
