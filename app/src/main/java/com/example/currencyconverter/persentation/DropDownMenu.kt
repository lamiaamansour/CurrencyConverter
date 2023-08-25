package com.example.currencyconverter.persentation

import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.example.currencyconverter.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GenderDropdownMenu() {

    val currencies = listOf(
        DropDownItem("USD", R.drawable.ic_united_states_of_america),
        DropDownItem("EUR", R.drawable.ic_united_kingdom),
        DropDownItem("JPY", R.drawable.ic_japan),
        DropDownItem("EGP", R.drawable.ic_flag_of_egypt),
        DropDownItem("USD", R.drawable.ic_united_states_of_america),
        DropDownItem("EUR", R.drawable.ic_united_kingdom),
        DropDownItem("JPY", R.drawable.ic_japan),
        DropDownItem("EGP", R.drawable.ic_flag_of_egypt)
    )

    var isExpanded by remember {
        mutableStateOf(false)
    }

    var gender by remember {
        mutableStateOf("")
    }

    ExposedDropdownMenuBox(
        expanded = isExpanded,
        onExpandedChange = { newValue ->
            isExpanded = newValue
        }
    ) {
        TextField(
            value = gender,
            onValueChange = {},
            readOnly = true,
            trailingIcon = {
                ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)
            },
            placeholder = {
                Text(text = "Please select your gender")
            },
            colors = ExposedDropdownMenuDefaults.textFieldColors(),
            modifier = Modifier.menuAnchor()
        )

        ExposedDropdownMenu(
            expanded = isExpanded,
            onDismissRequest = {
                isExpanded = false
            }
        ) {
            DropdownMenuItem(
                text = {
                    Text(text = "Male")
                },
                onClick = {
                    gender = "Male"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "Female")
                },
                onClick = {
                    gender = "Female"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "Other")
                },
                onClick = {
                    gender = "Other"
                    isExpanded = false
                }
            )
        }
    }
}