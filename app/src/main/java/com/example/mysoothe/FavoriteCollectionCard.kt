package com.example.mysoothe

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mysoothe.bottomnavigation.data.FavoriteCollectionData

@Composable
fun FavoriteCollectionCard(
    drawable: Int,
    text: String,
){
    Surface(
        shape = MaterialTheme.shapes.small
        ) {
        Row(
            modifier = Modifier.width(192.dp).height(56.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(56.dp),
                painter = painterResource(id = drawable),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Text(modifier = Modifier.padding(start = 5.dp), text = text)
        }
    }
}

@Composable
fun FavoriteCollectionGrid(){

    val favoriteCollectionsData = listOf<FavoriteCollectionData>(
        FavoriteCollectionData(
            drawable = R.drawable.fc1_short_mantras,
            text = "Short mantras",
        ),
        FavoriteCollectionData(
            drawable = R.drawable.fc2_nature_meditations,
            text = "NatureMeditation",
        ),
        FavoriteCollectionData(
            drawable = R.drawable.fc3_stress_and_anxiety,
            text = "Stress and anxiety",
        ),
        FavoriteCollectionData(
            drawable = R.drawable.fc4_self_massage,
            text = "Self massage",
        ),
        FavoriteCollectionData(
            drawable = R.drawable.fc5_overwhelmed,
            text = "Overwhelmed",
        ),
        FavoriteCollectionData(
            drawable = R.drawable.fc6_nightly_wind_down,
            text = "Nightly wind down",
        ),
    )
    
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.height(120.dp), content = {
        items(favoriteCollectionsData){ item ->
            FavoriteCollectionCard(
                drawable = item.drawable,
                text = item.text,
            )
        }
    })
}