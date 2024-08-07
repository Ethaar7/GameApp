package com.example.gameapp.presentation.feature.home

import androidx.compose.ui.res.painterResource
import com.example.gameapp.R

data class HomeState(
    val games: List<GameStat> = emptyList()
)

data class GameStat(
    val gameName: String = "",
    val gameType: String = "",
    val gameImage: String = "",
    val gameSize: String = "",
    val evaluation: String = "",
    val isClicked: Boolean = false,
)


data class HomeUiState(
    val imageUrl: List<Int> = listOf(
        R.drawable.image_3,
        R.drawable.image_5,
        R.drawable.image_6
    )
)