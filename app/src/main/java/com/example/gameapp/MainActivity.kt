package com.example.gameapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gameapp.presentation.composables.CardHome
import com.example.gameapp.presentation.composables.CardLargeHome
import com.example.gamegate.theme.GameAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GameAppTheme {
                    CardLargeHome(
                        imageUrl = "https://www.washingtonpost.com/resizer/whdW7uGuzYoJAXHY9J3t7r-HitI=/arc-anglerfish-washpost-prod-washpost/public/K27P4GK7NVGRJBDU4ZQZIASA3Y.jpg",
                        gameName = "jk",
                        gameType = "action",
                        onClickCard = { }
                    )
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
    GameAppTheme {
        Greeting("Android")
    }
}