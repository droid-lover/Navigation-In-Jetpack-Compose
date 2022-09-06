package com.nativemobilebits.navigationinjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.nativemobilebits.navigationinjetpackcompose.ui.theme.NavigationInJetpackComposeTheme

class MainActivity : ComponentActivity() {


    lateinit var navController : NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationInJetpackComposeTheme {

                navController = rememberNavController()
                AppNavGraph(navController = navController)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NavigationInJetpackComposeTheme {

    }
}