package com.example.gameapp.presentation.composables

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.gameapp.R


@Composable
fun ImageNetwork(
    modifier: Modifier = Modifier,
    imageUrl: String,
    contentDescription: String = "",
    contentScale: ContentScale = ContentScale.Crop,
    colorFilter: ColorFilter? = null
) {

    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data(imageUrl)
            .crossfade(true)
            .build(),
        colorFilter = colorFilter,
        placeholder = painterResource(R.drawable.stray),
        contentDescription = contentDescription,
        contentScale = contentScale,
        modifier = modifier.clip(RoundedCornerShape(12.dp)),
    )
}

@Preview(showSystemUi = true)
@Composable
fun jk() {
    ImageNetwork(imageUrl = "")
}