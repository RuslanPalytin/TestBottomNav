package com.example.mysoothe

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mysoothe.bottomnavigation.data.AlignYourBodyModel
import com.example.mysoothe.ui.theme.MySootheTheme

@Composable
fun AlignYourBodyElement(
    drawable: Int,
    text: String,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = modifier
                .padding(start = 3.dp, end = 3.dp)
                .size(90.dp)
                .clip(CircleShape),
            painter = painterResource(id = drawable),
            contentDescription = null,
            contentScale = ContentScale.Crop,
        )
        Text(
            text = text,
            modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 9.dp)
        )
    }
}

@Composable
fun AlignYourBodyRow() {

    val alignTourBody = listOf<AlignYourBodyModel>(
        AlignYourBodyModel(
            drawable = R.drawable.ab1_inversions,
            text = "Inversion",
        ),
        AlignYourBodyModel(
            drawable = R.drawable.ab2_quick_yoga,
            text = "Quick yoga",
        ),
        AlignYourBodyModel(
            drawable = R.drawable.ab3_stretching,
            text = "Stretching",
        ),
        AlignYourBodyModel(
            drawable = R.drawable.ab4_tabata,
            text = "Tabata",
        ),
        AlignYourBodyModel(
            drawable = R.drawable.ab5_hiit,
            text = "Hiit",
        ),
        AlignYourBodyModel(
            drawable = R.drawable.ab6_pre_natal_yoga,
            text = "Pre natal yoga",
        ),

    )

    LazyRow{
        itemsIndexed(alignTourBody){_, item ->
            AlignYourBodyElement(drawable = item.drawable, text = item.text)
        }
    }
}