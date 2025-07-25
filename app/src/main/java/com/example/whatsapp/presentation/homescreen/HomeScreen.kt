package com.example.whatsapp.presentation.homescreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R
import com.example.whatsapp.presentation.BottomNavigation.BottomNavigation
import com.example.whatsapp.presentation.Chat.ChatDesign
import com.example.whatsapp.presentation.Chat.model.ChatListModel

@Composable
@Preview(showSystemUi = true)
fun HomeScreen(modifier: Modifier = Modifier) {


    val chatData = listOf(
        ChatListModel(
           R.drawable.salmankhan,
            name = "Salman",
            time = "10:00AM",
            message = "Hyy Bro"
        ),
        ChatListModel(
            R.drawable.sharukhkhan,
            name = "Sharukh Khan",
            time = "11:00AM",
            message = "Hyy Bro"
        ),
        ChatListModel(
            R.drawable.sharadhakapoor,
            name = "Sharadha Kapoor",
            time = "12:00AM",
            message = "Hyy Bro"
        )
    )

     Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = {

            },
                containerColor = colorResource(id = R.color.light_green),
                modifier =  modifier.size(65.dp),
                contentColor = Color.White
            ) {
                Icon(painter = painterResource(R.drawable.chat_icon),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp))

            }
        },
        bottomBar = {
            BottomNavigation()
        }
    ) {
        Column(
            modifier = modifier.padding(it)
        ) {
            Spacer(modifier = modifier.height(16.dp))
            Box(
                modifier = modifier.fillMaxWidth()
            ) {
                Text(text = "WhatsApp",
                    fontSize = 28.sp,
                    color = colorResource(id = R.color.light_green),
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 16.dp),
                    fontWeight = FontWeight.Bold

                    )
                Row(
                    modifier = modifier.align(Alignment.CenterEnd)
                ) {
                    IconButton(onClick = {

                    }) {
                        Icon(painter = painterResource(R.drawable.camera),
                            contentDescription = null,
                            modifier = modifier.size(24.dp)
                            )
                    }

                    IconButton(onClick = {

                    }) {
                        Icon(
                            painter = painterResource(R.drawable.search),
                            contentDescription = null,
                            modifier = modifier.size(24.dp)

                        )

                    }

                    IconButton(onClick = {

                    }) {
                        Icon(
                            painter = painterResource(R.drawable.more),
                            contentDescription = null,
                            modifier = modifier.size(24.dp)
                        )

                    }
                }
            }
            HorizontalDivider()

            LazyColumn {
                items(chatData){
                    ChatDesign(chatListModel = it)
                }
            }
        }


    }

    
}