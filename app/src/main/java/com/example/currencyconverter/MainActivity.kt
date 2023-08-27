package com.example.currencyconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.currencyconverter.Screen.FavScreen
import com.example.currencyconverter.Screen.HomeScreen
import com.example.currencyconverter.viewmodle.MainViewModle
import com.example.currencyconverter.ui.theme.CurrencyConverterTheme

class  MainActivity : ComponentActivity() {
    val viewModel: MainViewModle by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CurrencyConverterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box{
                        Column (modifier = Modifier.verticalScroll(rememberScrollState())) {
                            HomeScreen()
                            FavScreen()
                        }
                    }

                }
            }
        }
    }
}

