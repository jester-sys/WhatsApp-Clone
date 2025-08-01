package com.example.whatsapp.presentation.BottomNavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsapp.R

@Composable
@Preview(showSystemUi = true)
fun BottomNavigation(modifier: Modifier = Modifier) {
    BottomAppBar(
        tonalElevation = 12.dp,
        containerColor = Color.White

    ) {
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Column (
                modifier = modifier.padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Icon(painter = painterResource(id = R.drawable.message_4475881),
                    contentDescription = null,
                    modifier = modifier.size(28.dp)
                )
                Spacer(modifier = modifier.height(2.dp))
                Text(text = "Chats", fontWeight = FontWeight.Bold)


            }

            Column (
                modifier = modifier.padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){


                Icon(painter = painterResource(id = R.drawable.update_icon),
                    contentDescription = null,
                    modifier = modifier.size(28.dp)
                )

                Spacer(modifier = modifier.height(2.dp))
                Text(text = "Updates", fontWeight = FontWeight.Bold)


            }

            Column (
                modifier = modifier.padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Icon(painter = painterResource(id = R.drawable.communities_icon),
                    contentDescription = null,
                    modifier = modifier.size(28.dp)
                )

                Spacer(modifier = modifier.height(2.dp))
                Text(text = "Communities", fontWeight = FontWeight.Bold)


            }

            Column (
                modifier = modifier.padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Icon(painter = painterResource(id = R.drawable.telephone),
                    contentDescription = null,
                    modifier = modifier.size(28.dp)
                )

                Spacer(modifier = modifier.height(2.dp))
                Text(text = "Calls", fontWeight = FontWeight.Bold)


            }
        }
    }
}