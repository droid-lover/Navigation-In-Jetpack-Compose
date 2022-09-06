package com.nativemobilebits.navigationinjetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun DetailsScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            modifier = Modifier.clickable {
                navController.navigate(route = AppScreens.homeScreen.route){
                    popUpTo(route = AppScreens.homeScreen.route){
                        inclusive = true
                    }
                }
//                navController.popBackStack()
            },
            text = "Details Screen",
            color = MaterialTheme.colors.secondary,
            fontSize = 21.sp
        )
    }
}

@Preview
@Composable
fun DetailsScreenPreview(){
    DetailsScreen(navController = rememberNavController())
}