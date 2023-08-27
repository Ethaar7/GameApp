package com.example.gameapp.presentation.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gameapp.R
import com.example.gameapp.ui.theme.Typography
import com.example.gamegate.theme.CardColor
import com.example.gamegate.theme.primary
import com.example.gamegate.theme.text87

@Composable
fun CustomChip(
    modifier: Modifier = Modifier,
    state: Boolean,
    painter: Painter,
    text: String,
    onClick: () -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    Card(
        modifier = modifier.clickable(
            interactionSource = interactionSource,
            indication = null
        ) {
            onClick()
        },
        colors = if (state) CardDefaults.cardColors(primary)
        else CardDefaults.cardColors(CardColor),
        shape = CircleShape
    ) {
        Row(
            modifier = Modifier.padding(
                horizontal = 16.dp, vertical = 6.dp
            ),
        ) {
            Image(
                painter = painter,
                contentDescription = null,
                modifier = Modifier
                    .size(20.dp),
            )

            Text(
                text = text,
                color = text87,
                style = Typography.bodyMedium,
                modifier = Modifier.padding(start = 8.dp)
            )
        }


    }
}

@Preview
@Composable
fun PCustomChip() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        CustomChip(
            state = true,
            text = "Adventures",
            onClick = { },
            painter = painterResource(id = R.drawable.group)
        )
        CustomChip(
            state = false,
            text = "Action",
            onClick = { },
            painter =  painterResource(id = R.drawable.action)
        )
        CustomChip(
            state = false,
            text = "Srategy",
            onClick = { },
            painter =  painterResource(id = R.drawable.sratage)
        )
    }

}