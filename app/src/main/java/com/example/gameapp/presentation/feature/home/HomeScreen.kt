package com.example.gameapp.presentation.feature.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import com.example.gameapp.presentation.composables.CardFav
import com.example.gameapp.presentation.composables.CardHome
import com.example.gameapp.presentation.composables.CardLargeHome
import com.example.gameapp.presentation.composables.GamePager
import com.example.gameapp.presentation.composables.ItemLabel
import com.example.gameapp.presentation.composables.PCustomChip
import com.example.gamegate.theme.background

class HomeScreen : Screen {

    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    override fun Content() {
        val screenModel = rememberScreenModel { HomeScreenModel() }
        HomeContent(state = HomeState(), statePager = HomeUiState())
    }

}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeContent(
    state: HomeState,
//    pagerState: PagerState,
    statePager: HomeUiState
) {
    LazyVerticalGrid(
        modifier = Modifier
            .fillMaxSize()
            .background(background)
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(bottom = 16.dp),
        columns = GridCells.Fixed(2)
    ) {

//        item(span = { GridItemSpan(2) })
//        {
//            GamePager(
//                games = statePager.imageUrl,
//                pagerState = pagerState,
//                onClickPagerItem = {}
//            )
//        }


        item(
            span = { GridItemSpan(2) },
        ) {
            Column() {
                ItemLabel(label = "New", onClick = {})
                Game(
                    statePager = HomeUiState()
                )
            }
        }
        item(
            span = { GridItemSpan(2) },
        ) {
            GameBest(statePager = HomeUiState())
        }

        item(
            span = { GridItemSpan(2) },
        ) {
            Column() {
                ItemLabel(label = "Top Games", onClick = {})
                Game(
                    statePager = HomeUiState()
                )
            }
        }

        item(
            span = { GridItemSpan(2) },
        ) {
            Column() {
                ItemLabel(label = "Genres", onClick = {})
                PCustomChip()
            }
        }

        item(
            span = { GridItemSpan(2) },
        ) {
            GameFav(
                statePager = HomeUiState()
            )
        }

    }


}

@Composable
fun Game(
    statePager: HomeUiState
) {
    CardHome(
        imageUrl = statePager.imageUrl.toString(),
        gameName = "stray",
        gameType = "action",
        onClickCard = {}
    )
}

@Composable
fun GameBest(
    statePager: HomeUiState
) {
    Column() {
        ItemLabel(label = "The best action games", onClick = {})
        CardLargeHome(
            imageUrl = statePager.imageUrl.toString(),
            gameName = "stray j",
            gameType = "action",
            onClickCard = {}
        )
    }
}

@Composable
fun GameFav(
    statePager: HomeUiState
) {
    CardFav(
        imageUrl = statePager.imageUrl.toString(),
        gameName = "stray",
        gameType = "action",
        gameSize = "67GB",
        evaluation = "4.7",
        onClickCard = {})
}

@Preview(showBackground = true)
@Composable
fun ggh() {
    HomeContent(state = HomeState(), statePager = HomeUiState())
}
