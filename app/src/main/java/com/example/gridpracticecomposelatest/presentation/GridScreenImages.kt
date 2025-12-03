package com.example.gridpracticecomposelatest.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest


@Composable
fun GridScreenImage(uris: List<String>) {

    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(uris) { url ->
            Box(
                modifier = Modifier
                    .aspectRatio(1f)                    // Perfect square
                    .clip(RoundedCornerShape(12.dp))    // Rounded corners on the cell
                    .background(Color.LightGray)
                    .clickable { /* optional */ }
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data("$url")
                        .crossfade(true) // Optional: nice fade-in effect
                        .build(),
                    contentDescription = "Grid image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()                  // This is the key!
                        .background(Color.LightGray),   // fallback while loading
                    placeholder = rememberAsyncImagePainter(url), // optional: smoother
                   // error = painterResource(R.drawable.ic_error) // optional
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GridScreenImagePreview(){
    val randomWords = mutableListOf(
        "https://raw.githubusercontent.com/ServiceStack/images/refs/heads/master/hero/photo-1468325089340-2ec20e175048.jpg",
        "https://raw.githubusercontent.com/ServiceStack/images/refs/heads/master/hero/photo-1468325089340-2ec20e175048.jpg",
        "https://raw.githubusercontent.com/ServiceStack/images/refs/heads/master/hero/photo-1468325089340-2ec20e175048.jpg",
        "https://as2.ftcdn.net/v2/jpg/15/14/19/51/1000_F_1514195140_cjABT4J4CuBGYNia8ARy5APiuAFK3fXp.jpg",
        "https://as1.ftcdn.net/v2/jpg/16/92/00/18/1000_F_1692001870_nIFeepbsH3nvI51LK2V6UTpwjiE30kdz.jpg",
        "https://as1.ftcdn.net/jpg/11/89/94/08/1000_F_1189940848_Ntn9ArKmJhKxf7mLMbmDKHyOt8qk5aXQ.webp",
        "https://paintable.cc/wp-content/uploads/2015/11/035-thiago-januario.jpg",

    )
    GridScreenImage(randomWords)
}