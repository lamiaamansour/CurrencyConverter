package com.example.currencyconverter.Screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun HomeScreen() {

    Column {

    }
    var isConvertClick by remember {
        mutableStateOf(true)
    }

    var isCompareClick by remember {
        mutableStateOf(false)
    }

    ConstraintLayout {
        val ( topapp,custom, convertAndCompare) =createRefs()

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(topapp) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            TopApp()
        }

        Box(
            modifier = Modifier
                .constrainAs(custom) {
                    top.linkTo(parent.top , margin = 215.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            CustomToggleButton(onConvertClick = { isConvertClick = true
            isCompareClick=false} ) {
                isConvertClick =false
                isCompareClick =true
            }
        }

        Box(
            modifier = Modifier
                .constrainAs(convertAndCompare) {
                    top.linkTo(topapp.bottom )
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            AnimatedVisibility(visible = isConvertClick) {
                ConvertCard()
            }

            AnimatedVisibility(visible = isCompareClick) {
                CompareCard()
            }
        }
    }
}
