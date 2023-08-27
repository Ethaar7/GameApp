package com.example.gameapp.presentation.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gameapp.R
import com.example.gamegate.theme.CardColor
import com.example.gameapp.ui.theme.Typography
import com.example.gamegate.theme.text37
import com.example.gamegate.theme.text87


@Composable
fun CardLargeHome(
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
                .width(160.dp)
                .height(196.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(CardColor)
                .clickable(onClick = { onClickCard() })

        ) {
            Column() {
                ImageNetwork(
                    imageUrl = imageUrl,
                    modifier = Modifier
                        .padding(8.dp)
                        .height(131.dp),

                    )
                Text(
                    text = gameName,
                    style = Typography.titleMedium,
                    modifier = Modifier.padding(start = 16.dp)
                )

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(
                        text = gameType,
                        style = Typography.bodySmall,
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.heart_angle2),
                        contentDescription = null,
                        tint = text87,
                        modifier = Modifier
                            .size(16.dp),
                    )
                }
            }

        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun lsky() {
    CardLargeHome(
        imageUrl = "https://www.washingtonpost.com/resizer/whdW7uGuzYoJAXHY9J3t7r-HitI=/arc-anglerfish-washpost-prod-washpost/public/K27P4GK7NVGRJBDU4ZQZIASA3Y.jpg",
        gameName = "Stray",
        gameType = "Adventures",
        onClickCard = {}

    )
}