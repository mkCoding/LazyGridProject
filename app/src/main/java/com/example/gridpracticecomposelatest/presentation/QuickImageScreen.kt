package com.example.gridpracticecomposelatest.presentation

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest


@Composable
fun QuickImageScreen(){
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data("https://cdn.myanimelist.net/images/anime/13/14141.jpg")
            .crossfade(true) // Optional: nice fade-in effect
            .build(),
        contentDescription = "Grid image",
       // placeholder = painterResource(R.drawable.ic_placeholder), // Custom placeholder drawable
        //error = painterResource(R.drawable.ic_error), // Custom error drawable
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(100.dp) // Example size for a grid item
    )
}