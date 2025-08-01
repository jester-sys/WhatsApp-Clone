package com.example.whatsapp.presentation.registration

import android.graphics.Color
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R

@Composable
@Preview(showSystemUi = true)
fun UserRegistrationScreen(modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }
    var selectedCountry by remember { mutableStateOf("India") }

    var countryCode by remember { mutableStateOf("+91") }
    var phoneNumber by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Spacer(modifier = modifier.height(24.dp))
        Text(
            text = "Enter your phone number",
            fontSize = 20.sp,
            color = colorResource(id = R.color.dark_green),
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = modifier.height(24.dp))

        Row {
            Text(text = "what will need to verify your phone number")
            Spacer(modifier = modifier.width(4.dp))
            Text(text = "what's", color = colorResource(id = R.color.dark_green))
        }
        Text(text = "my number?", color = colorResource(id = R.color.dark_green))

        Spacer(modifier = modifier.height(16.dp))

        TextButton(
            onClick = {
                expanded = true
            }, modifier.fillMaxWidth()
        ) {
            Box(
                modifier.width(230.dp)
            ) {
                Text(
                    text = selectedCountry,
                    modifier = modifier.align(Alignment.Center),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = androidx.compose.ui.graphics.Color.Black
                )
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,

                    contentDescription = null,
                    modifier = modifier.align(Alignment.CenterEnd),
                    tint = colorResource(id = R.color.light_green)
                )
            }

        }

        HorizontalDivider(
            modifier.padding(horizontal = 66.dp),
            thickness = 2.dp,
            color = colorResource(R.color.light_green)
        )
        DropdownMenu(expanded = expanded, onDismissRequest = {
            expanded = false
        },
            modifier = Modifier.fillMaxWidth()
        ) {

            listOf("India", "USA", "China", "Canada").forEach { country ->
                DropdownMenuItem(
                    text = {
                        Text(text = country)
                    },
                    onClick = {
                        selectedCountry = country
                        expanded = false
                    }
                )

            }
        }

        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row {
                TextField(
                    value = countryCode, onValueChange = {
                        countryCode = it

                    },
                    modifier.width(70.dp),
                    singleLine = true,
                    textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = androidx.compose.ui.graphics.Color.Transparent,
                        focusedContainerColor = androidx.compose.ui.graphics.Color.Transparent,

                        unfocusedIndicatorColor = colorResource(id = R.color.light_green),
                        focusedIndicatorColor = colorResource(id = R.color.light_green)


                    )
                )

                Spacer(modifier.width(8.dp))
                TextField(
                    value = phoneNumber, onValueChange = {
                        phoneNumber = it
                    },
                    placeholder = { Text(text = "phone Number") },
                    singleLine = true,
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = androidx.compose.ui.graphics.Color.Transparent,
                        focusedContainerColor = androidx.compose.ui.graphics.Color.Transparent,

                        unfocusedIndicatorColor = colorResource(id = R.color.light_green),
                        focusedIndicatorColor = colorResource(id = R.color.light_green)
                    )
                )
            }
            Spacer(modifier= modifier.height(16.dp))
            Text(text = "Carrier charges may apply",
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                )

            Spacer(modifier = modifier.height(16.dp))
            Button(onClick = {},
                shape = RoundedCornerShape(6.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.dark_green)
                )
                ) {
                Text(text = "Next",
                    fontSize = 16.sp
                )
            }
        }


    }
}