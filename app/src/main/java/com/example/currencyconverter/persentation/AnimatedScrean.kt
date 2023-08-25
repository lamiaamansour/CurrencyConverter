package com.example.currencyconverter.persentation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.currencyconverter.R

@Composable
fun AnimatedScreen() {

    Column(modifier = Modifier.fillMaxSize()) {

        var isVisiable by remember {
            mutableStateOf(false)
        }
        IconButton(onClick = {
            isVisiable = !isVisiable
        }) {
            Image(
                painter = painterResource(id = R.drawable.ic_clear),
                contentDescription = null
            )
        }

        Text(text = "Favorite")

        AnimatedVisibility(visible = isVisiable) {
            Box(modifier = Modifier.background(color = Color.White))
        }
    }


}