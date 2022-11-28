package com.example.mysoothe.viewpager.navigation

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.mysoothe.R

@Composable
fun TopBar(){
    TopAppBar(
        title = { Text(text = "wegweg", fontSize = 18.sp)},
        backgroundColor = Color.Yellow,
        contentColor = Color.White
    )
}

@Preview (showBackground = true)
@Composable
fun TopBarPreview () {
    TopBar()
}