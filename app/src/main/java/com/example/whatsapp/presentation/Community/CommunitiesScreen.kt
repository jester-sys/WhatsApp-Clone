package com.example.whatsapp.presentation.Community

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R
import com.example.whatsapp.presentation.BottomNavigation.BottomNavigation
import com.example.whatsapp.presentation.Community.model.CommunityData

@Composable
@Preview(showSystemUi = true)
fun CommunitiesScreen(modifier: Modifier = Modifier) {

val sampleCommunity = listOf(
    CommunityData(
        R.drawable.img,
        "Tech Tehcnolgy",
        "256 members"
    ),
    CommunityData(
        R.drawable.img,
        "Gta 5 GamePlay",
        "340 members"
    ),
    CommunityData(
        R.drawable.img,
        "Food Lover",
        "56 members"
    ),
)
    Scaffold(
        topBar = {
            TopBar(modifier)
        },
        bottomBar = {
            BottomNavigation()
        }
    ) {
        Column(
            modifier
                .padding(it)
        ) {

            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(
                        id = R.color.light_green
                    )
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)


            ) {
                Text(
                    "Start a new Community",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )

            }
            Spacer(modifier = modifier.height(8.dp))
            Text("Your Communities",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
            LazyColumn {
                items(sampleCommunity) {
                    CommunityItem(communityData = it)
                }
            }
        }



    }


}
