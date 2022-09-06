package com.nativemobilebits.navigationinjetpackcompose

sealed class AppScreens (val route: String){

    object homeScreen : AppScreens("home_screen")
    object detailsScreen : AppScreens("details_screen")

}
