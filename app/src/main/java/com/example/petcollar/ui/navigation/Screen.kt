package com.example.petcollar.ui.navigation

sealed class Screen(val route: String) {
    data object Home : Screen("home_route")
}