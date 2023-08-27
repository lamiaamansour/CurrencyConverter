package com.example.currencyconverter.Screen

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConvertCard() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp, top = 50.dp)

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(30.dp)
        ) {
            Text(
                text = "Amount",
                style = TextStyle(
                    color = Color.Black, fontSize = 15.sp, fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 10.dp)
            )
            Text(
                text = "From",
                style = TextStyle(
                    color = Color.Black, fontSize = 15.sp, fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 10.dp)
            )
        }

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {

            var isOpen by remember { mutableStateOf(false) }
            var text by remember { mutableStateOf("") }

            val shape = CircleShape

            if (isOpen) {
                TextField(
                    value = text,
                    onValueChange = { newValue ->
                        text = newValue
                    },
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                    singleLine = true,
                    modifier = Modifier
                        .width(150.dp)
                        .border(2.dp, MaterialTheme.colorScheme.inverseOnSurface, shape)
                        .padding(16.dp)
                )
            } else {
                Text(
                    text = "1 EGP", style = TextStyle(
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    ), modifier = Modifier
                        .width(150.dp)
                        .border(2.dp, MaterialTheme.colorScheme.inverseOnSurface, shape)
                        .padding(16.dp)
                        .clickable { isOpen = true }
                )
            }


            Spacer(modifier = Modifier.width(10.dp))

            CurrencyDropDown(Modifier)
        }

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(30.dp)
        ) {
            Text(
                text = "To",
                style = TextStyle(
                    color = Color.Black, fontSize = 15.sp, fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 10.dp)
            )

            Text(
                text = "Amount",
                style = TextStyle(
                    color = Color.Black, fontSize = 15.sp, fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 10.dp)
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            CurrencyDropDown(modifier = Modifier.weight(1f))

            Spacer(modifier = Modifier.width(10.dp))
            var isOpen by remember { mutableStateOf(false) }
            var text by remember { mutableStateOf("") }

            val shape = CircleShape

            if (isOpen) {
                TextField(
                    value = text,
                    onValueChange = { newValue ->
                        text = newValue
                    },
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                    singleLine = true,
                    modifier = Modifier
                        .width(150.dp)
                        .border(2.dp, MaterialTheme.colorScheme.inverseOnSurface, shape)
                        .padding(16.dp)
                )
            } else {
                Text(
                    text = "1", style = TextStyle(
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    ), modifier = Modifier
                        .width(150.dp)
                        .border(2.dp, MaterialTheme.colorScheme.inverseOnSurface, shape)
                        .padding(16.dp)
                        .weight(1f)
                        .clickable { isOpen = true }
                )
            }
        }

        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = "Convert", style = TextStyle(
                    fontSize = 16.sp, fontWeight = FontWeight.Bold
                )
            )
        }

    }
}
