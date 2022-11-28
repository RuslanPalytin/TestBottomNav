package com.example.mysoothe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mysoothe.bottomnavigation.screenbottomnav.SplashScreen
import com.example.mysoothe.ui.theme.Gray
import com.example.mysoothe.ui.theme.MySootheTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MySootheTheme {
                SplashScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MySootheTheme {
        Column(modifier = Modifier
            .fillMaxSize()
            .background(color = Gray)
        ) {
            HomeSectionPreview()
        }
    }
}