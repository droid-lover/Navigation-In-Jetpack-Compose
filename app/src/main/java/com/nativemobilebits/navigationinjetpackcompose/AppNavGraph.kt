package com.nativemobilebits.navigationinjetpackcompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = AppScreens.homeScreen.route
    ) {

        composable(route = AppScreens.homeScreen.route){
            HomeScreen(navController = navController)
        }

        composable(route = AppScreens.detailsScreen.route){
            DetailsScreen(navController = navController)
        }

    }
}