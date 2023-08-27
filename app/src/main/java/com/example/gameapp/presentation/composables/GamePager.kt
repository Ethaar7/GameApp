package com.example.gameapp.presentation.composables

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.gameapp.presentation.feature.home.GameStat
import com.example.gamegate.theme.primary
import com.example.gamegate.theme.text87

@Composable
@OptIn(ExperimentalFoundationApi::class)
fun GamePager(
//    games: List<GameStat>,
    games: List<Int>,
    pagerState: PagerState,
    onClickPagerItem: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        HorizontalPager(
            contentPadding = PaddingValues(horizontal = 16.dp),
            state = pagerState
//            contentPadding = PaddingValues(horizontal = 16.dp),
//            pageCount = games.size,
//            state = pagerState,
        ) {
            ImageNetwork(
                imageUrl = games.size.toString(),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 4.dp)
                    .clip(shape = RoundedCornerShape(24.dp))
                    .background(text87)
                    .height(160.dp)
                    .clickable(onClick = { onClickPagerItem() }),
            )
        }
        HorizontalPagerIndicator(
            itemCount = if (games.size > 3) 3 else games.size,
            selectedPage = pagerState.currentPage,
        )
    }
}


@Composable
fun HorizontalPagerIndicator(
    itemCount: Int,
    selectedPage: Int,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        for (i in 0 until itemCount) {
            PagerIndicatorItem(selected = i == selectedPage)
            Spacer(modifier = Modifier.width(8.dp))
        }
    }
}

@Composable
fun PagerIndicatorItem(selected: Boolean) {
    val color =
        if (selected) primary
        else MaterialTheme.colorScheme.outlineVariant
    val width = if (selected) 20.dp else 12.dp
    val height = 6.dp
    val cornerRadius = 4.dp

    Box(
        modifier = Modifier
            .size(width = width, height = height)
            .background(color, shape = RoundedCornerShape(cornerRadius))
    )
}

