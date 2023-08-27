package com.example.gameapp.presentation.feature.home

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