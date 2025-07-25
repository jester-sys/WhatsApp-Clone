package com.example.whatsapp.presentation.Update

import android.widget.Space
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R
import com.example.whatsapp.presentation.BottomNavigation.BottomNavigation
import com.example.whatsapp.presentation.Update.Channel.ChannelDesign
import com.example.whatsapp.presentation.Update.Channel.model.ChannelModel
import com.example.whatsapp.presentation.Update.model.StatusData

@Composable
@Preview(showSystemUi = true)
fun UpdateScreen(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()
    val statusData = listOf(
        StatusData(
            R.drawable.boy1,
            "Nishant",
            "Just now"
        ),
        StatusData(
            R.drawable.boy,
            "Rohit Yadav",
            "10 min ago"
        ),
        StatusData(
            R.drawable.boy3,
            "CarryMinatory",
            "2 min ago"
        )
    )
    val sampleChannel = listOf(
        ChannelModel(
            image = R.drawable.neat_roots,
            "Neats Root",
            "Latest News  and Tech"
        ),
        ChannelModel(
            image = R.drawable.img,
            "Food Picker",
            "Discover new Food"
        ),
        ChannelModel(
            image = R.drawable.meta,
            "Meta",
            "Explore The World"
        ),
    )
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {

                },
                containerColor = colorResource(R.color.light_green),
                modifier = modifier.size(65.dp),
                contentColor = Color.White
            ) {
                Icon(
                    painter = painterResource(R.drawable.baseline_photo_camera_24),
                    contentDescription = null
                )
            }
        },
        bottomBar = {
            BottomNavigation()
        },
        topBar = {
            TopBar()
        }
    ) {
        Column(
            modifier = modifier
                .padding(it)
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            Text(
                text = "Status",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )
            MyStatus()
            statusData.forEach {
                StatusItem(statusData =it)
            }
            HorizontalDivider(
                color = Color.Gray
            )
            Text(
                text = "Channels",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )
            Column(
                modifier = modifier.padding(horizontal = 16.dp)
            ) {
                Text("stay updated on topics that to you. Find channel to\n Find channels to follow")
            }

            Spacer(modifier = Modifier.height(16.dp))
            sampleChannel.forEach {
                ChannelDesign(channelModel = it)
            }


        }
    }

}