package com.example.presentation.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gameapp.R
import com.example.gamegate.theme.CardColor


@Preview(showBackground = true)
@Composable
fun CardHome() {
    Box(
        modifier = Modifier
            .width(124.dp)
            .height(156.dp)
            .background(CardColor)
    ) {
        Image(painter = painterResource(R.drawable.stray), contentDescription = null)
    }
}
