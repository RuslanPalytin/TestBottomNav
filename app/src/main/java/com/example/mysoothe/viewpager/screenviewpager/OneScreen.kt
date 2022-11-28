package com.example.mysoothe.viewpager.screenviewpager

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun OneScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Red)
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "One Screen",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
    }
}

@Preview (showBackground = true)
@Composable
fun OneScreenPreview(){
    OneScreen()
}