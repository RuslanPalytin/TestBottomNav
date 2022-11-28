package com.example.mysoothe.viewpager.navigation

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.pager.*
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Tabs(
    tabs: List<TabItem>,
    pagerState: PagerState
){
    val scope = rememberCoroutineScope()

    TabRow(
        selectedTabIndex = pagerState.currentPage,
        backgroundColor = Color.Red,
        contentColor = Color.White,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier.pagerTabIndicatorOffset(pagerState, tabPositions)
            )
        }
    ) {
        tabs.forEachIndexed{ index, tab ->  
            LeadingIconTab(
                icon = { Icon(imageVector = tab.icon, contentDescription = "", tint = Color.Black)},
                text = { Text(text = tab.title) },
                selected = pagerState.currentPage == index,
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                }
            )
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun TabContext(
    tabs: List<TabItem>,
    pagerState: PagerState
){
    HorizontalPager(
        state = pagerState,
        count = tabs.size
    ) { page ->
        tabs[page].screen()
    }
    

}

@Preview (showBackground = true)
@OptIn(ExperimentalPagerApi::class)
@Composable
fun TabsPreview(){
    val tabs = listOf(
        TabItem.OneScreen,
        TabItem.TwoScreen,
        TabItem.ThirdScreen
    )
    val pagerState = rememberPagerState()
    Tabs(tabs = tabs, pagerState = pagerState)
}