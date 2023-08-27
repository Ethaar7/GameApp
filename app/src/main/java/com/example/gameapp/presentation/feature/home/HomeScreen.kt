package com.example.gameapp.presentation.feature.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import com.example.gameapp.presentation.composables.CardFav
import com.example.gameapp.presentation.composables.CardHome
import com.example.gameapp.presentation.composables.CardLargeHome
import com.example.gameapp.presentation.composables.GamePager
import com.example.gameapp.presentation.composables.ItemLabel
import com.example.gameapp.presentation.composables.PCustomChip

class HomeScreen : Screen {


    @Composable
    override fun Content() {
        val screenModel = rememberScreenModel { HomeScreenModel() }
//        HomeContent(state =, pagerState =)

    }

}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeContent(
    state: HomeState,
    pagerState: PagerState,
) {
    LazyVerticalGrid(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(bottom = 16.dp),
        columns = GridCells.Fixed(2)
    ) {
        item(span = { GridItemSpan(2) })
        {
            GamePager(
                games = state.games,
                pagerState = pagerState,
                onClickPagerItem = {}
            )
        }


        item(
            span = { GridItemSpan(2) },
        ) {
            Column() {
                ItemLabel(label = "New", onClick = {})
                Game(
                    state = state.games[0]
                )
            }
        }

        item(
            span = { GridItemSpan(2) },
        ) {
            GameBest(state = state.games[0])
        }

        item(
            span = { GridItemSpan(2) },
        ) {
            Column() {
                ItemLabel(label = "Top Games", onClick = {})
                Game(
                    state = state.games[0]
                )
            }
        }

        item(
            span = { GridItemSpan(2) },
        ) {
            Column() {
                ItemLabel(label = "New", onClick = {})
                PCustomChip()
            }
        }

        item(
            span = { GridItemSpan(2) },
        ) {
            GameFav(
                state = state.games[0]
            )
        }

    }


}

@Composable
fun Game(
    state: GameStat
) {
    CardHome(
        imageUrl = state.gameImage,
        gameName = state.gameName,
        gameType = state.gameType,
        onClickCard = { state.isClicked }
    )
}

@Composable
fun GameBest(
    state: GameStat
) {
    Column() {
        ItemLabel(label = "The best action games", onClick = {})
        CardLargeHome(
            imageUrl = state.gameImage,
            gameName = state.gameName,
            gameType = state.gameType,
            onClickCard = { state.isClicked }
        )
    }
}

@Composable
fun GameFav(
    state: GameStat
) {
    CardFav(
        imageUrl = state.gameImage,
        gameName = state.gameName,
        gameType = state.gameType,
        gameSize = state.gameSize,
        evaluation = state.evaluation,
        onClickCard = {})
}


