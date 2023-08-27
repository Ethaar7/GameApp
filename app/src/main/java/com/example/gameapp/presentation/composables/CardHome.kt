package com.example.gameapp.presentation.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gamegate.theme.CardColor
import com.example.gameapp.ui.theme.Typography


@Composable
fun CardHome(
    imageUrl: String,
    gameName: String,
    gameType: String,
    onClickCard: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 8.dp)) {
        Box(
            modifier = Modifier
                .width(124.dp)
                .height(156.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(CardColor)
                .clickable(onClick = { onClickCard() })

        ) {
            Column() {
                ImageNetwork(
                    imageUrl = imageUrl,
                    modifier = Modifier
                        .padding(8.dp)
                        .height(85.dp),

                    )
                Text(
                    text = gameName,
                    style = Typography.titleMedium,
                    modifier = Modifier.padding(start = 16.dp)
                )

                Text(
                    text = gameType,
                    style = Typography.bodySmall,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }

        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun lsk() {
    CardHome(
        imageUrl = "https://www.washingtonpost.com/resizer/whdW7uGuzYoJAXHY9J3t7r-HitI=/arc-anglerfish-washpost-prod-washpost/public/K27P4GK7NVGRJBDU4ZQZIASA3Y.jpg",
        gameName = "Stray",
        gameType = "Adventures",
        onClickCard = {}

    )
}