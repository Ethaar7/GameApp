package com.example.gameapp.presentation.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gameapp.R
import com.example.gameapp.ui.theme.Typography
import com.example.gamegate.theme.CardColor
import com.example.gamegate.theme.star
import com.example.gamegate.theme.text87


@Composable
fun CardFav(
    imageUrl: String,
    gameName: String,
    gameType: String,
    gameSize: String,
    evaluation: String,
    onClickCard: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(85.dp)
            .clip(RoundedCornerShape(16.dp))
            .clickable(onClick = { onClickCard() })
            .padding(top = 16.dp),
        colors = CardDefaults.cardColors(
            containerColor = (CardColor)
        )

    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            ImageNetwork(
                imageUrl = imageUrl,
                modifier = Modifier
                    .padding(8.dp)
                    .width(62.dp),
            )
            Column(
                modifier = Modifier.padding(
                    start = 8.dp,
                    end = 16.dp,
                    top = 8.dp,
                    bottom = 8.dp
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = gameName,
                        style = Typography.titleMedium,
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.heart_angle2),
                        contentDescription = null,
                        tint = text87,
                        modifier = Modifier
                            .size(16.dp),
                    )
                }

                Text(
                    text = gameType,
                    style = Typography.bodySmall,
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.star),
                        contentDescription = null,
                        tint = star,
                        modifier = Modifier
                            .size(16.dp),
                    )
                    Text(
                        text = evaluation,
                        style = Typography.bodySmall,
                    )

                    Text(
                        text = gameSize,
                        style = Typography.bodySmall,
                        modifier = Modifier.padding(start = 24.dp)
                    )

                }
            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun lskd() {
    CardFav(
        imageUrl = "https://www.washingtonpost.com/resizer/whdW7uGuzYoJAXHY9J3t7r-HitI=/arc-anglerfish-washpost-prod-washpost/public/K27P4GK7NVGRJBDU4ZQZIASA3Y.jpg",
        gameName = "Stray",
        gameType = "Adventures",
        onClickCard = {},
        gameSize = "95GB",
        evaluation = "4.9",
    )
}