package com.example.mysoothe

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mysoothe.ui.theme.MySootheTheme
import java.util.*

@Preview (showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun HomeSectionPreview(){
    MySootheTheme {
        Column(modifier = Modifier
            .padding(vertical = 16.dp)
            .verticalScroll(rememberScrollState())
        ) {
            SearchBar()
            HomeSection(text = "Align yor body") {
                AlignYourBodyRow()
            }
            Spacer(modifier = Modifier.height(16.dp))
            HomeSection(text = "Favorite Collections") {
                FavoriteCollectionGrid()
            }
        }
    }
}

@Composable
fun HomeSection(
    text: String,
    content: @Composable () -> Unit
) {
    Column() {
        Text(
            text = text.uppercase(Locale.getDefault()),
            style = TextStyle(fontSize = 20.sp),
            modifier = Modifier
                .paddingFromBaseline(top = 24.dp, bottom = 8.dp)
                .padding(horizontal = 16.dp)
        )
        content()
    }
}