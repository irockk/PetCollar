package com.example.petcollar.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.petcollar.feature.presentation.HomeRoute
import com.example.petcollar.ui.components.SnackbarHandler

@Composable
fun Navigator(modifier: Modifier) {
    val navController = rememberNavController()
    SnackbarHandler { snackbarHostState, showSnackbar ->
        Scaffold(
            snackbarHost = { SnackbarHost(snackbarHostState) }
        ) { paddingValues ->
            NavHost(
                modifier = modifier.padding(paddingValues),
                navController = navController,
                startDestination = Screen.Home.route
            ) {
                composable(route = Screen.Home.route) {
                    HomeRoute()
                }
            }
        }
    }
}