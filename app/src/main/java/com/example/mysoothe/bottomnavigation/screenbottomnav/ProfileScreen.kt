package com.example.mysoothe.bottomnavigation.screenbottomnav

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import com.example.mysoothe.viewpager.navigation.TabContext
import com.example.mysoothe.viewpager.navigation.TabItem
import com.example.mysoothe.viewpager.navigation.Tabs
import com.example.mysoothe.viewpager.navigation.TopBar
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun ProfileScreen(){
    val tabs = listOf(
        TabItem.OneScreen,
        TabItem.TwoScreen,
        TabItem.ThirdScreen,
    )

    val pagerState = rememberPagerState()
    Scaffold(
        topBar = { TopBar() }
    ) { padding ->
        Column(modifier = Modifier.padding(padding)) {
            Tabs(tabs = tabs, pagerState = pagerState)
            HorizontalPagerIndicator(pagerState = pagerState, modifier = Modifier.align(CenterHorizontally))

            TabContext(tabs = tabs, pagerState = pagerState)
        }
    }
}