package com.example.gridpracticecomposelatest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gridpracticecomposelatest.presentation.GridScreenImage
import com.example.gridpracticecomposelatest.presentation.GridScreenWords
import com.example.gridpracticecomposelatest.presentation.QuickImageScreen
import com.example.gridpracticecomposelatest.ui.theme.GridPracticeComposeLatestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        setContent {
            GridPracticeComposeLatestTheme {

                //QuickImageScreen()

                // Image Render - Only
                val moreGreatImages = listOf(
                    // 11 images you provided (included for completeness)
                    "https://maymont.org/wp-content/uploads/2020/04/banner-red-fox.jpg",
                    "https://picsum.photos/800/800?random=1",
                    "https://picsum.photos/800/800?random=2",
                    "https://picsum.photos/800/800?random=3",
                    "https://picsum.photos/800/800?random=4",
                    "https://picsum.photos/800/800?random=5",
                    "https://picsum.photos/800/800?random=6",
                    "https://picsum.photos/800/800?random=7",
                    "https://picsum.photos/800/800?random=8",
                    "https://picsum.photos/800/800?random=9",
                    "https://picsum.photos/800/800?random=10",

                    // 20 NEW Images
                    "https://picsum.photos/800/800?random=11",
                    "https://picsum.photos/800/800?random=12",
                    "https://picsum.photos/800/800?random=13",
                    "https://picsum.photos/800/800?random=14",
                    "https://picsum.photos/800/800?random=15",
                    "https://picsum.photos/800/800?random=16",
                    "https://picsum.photos/800/800?random=17",
                    "https://picsum.photos/800/800?random=18",
                    "https://picsum.photos/800/800?random=19",
                    "https://picsum.photos/800/800?random=20",
                    "https://picsum.photos/800/800?random=21",
                    "https://picsum.photos/800/800?random=22",
                    "https://picsum.photos/800/800?random=23",
                    "https://picsum.photos/800/800?random=24",
                    "https://picsum.photos/800/800?random=25",
                    "https://picsum.photos/800/800?random=26",
                    "https://picsum.photos/800/800?random=27",
                    "https://picsum.photos/800/800?random=28",
                    "https://picsum.photos/800/800?random=29",
                    "https://picsum.photos/800/800?random=30"
                )

                GridScreenImage(moreGreatImages)

                // Work Render - Only
//                val randomWords = mutableListOf(
//                    "mountain", "river", "happy", "blue", "run", "fast",
//                    "book", "desk", "sleep", "green", "quiet", "star",
//                    "cloud", "music", "write", "sweet", "deep", "ocean",
//                    "tree", "chair", "light", "yellow", "swim", "cold",
//                    "fire", "jump", "smooth", "soft", "loud", "stone"
//                )
//                GridScreenWords(randomWords)
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GridPracticeComposeLatestTheme {
        Greeting("Android")
    }
}