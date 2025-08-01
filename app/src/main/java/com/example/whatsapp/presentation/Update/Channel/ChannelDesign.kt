package com.example.whatsapp.presentation.Update.Channel

import android.graphics.fonts.Font
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R
import com.example.whatsapp.presentation.Update.Channel.model.ChannelModel

@Composable
fun ChannelDesign(modifier: Modifier = Modifier,channelModel: ChannelModel) {
    var isFollowing by remember {
        mutableStateOf(false)
    }
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(channelModel.image),
            contentDescription = null,
            modifier = modifier
                .size(60.dp)
                .padding(4.dp)
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(channelModel.name, fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Text(channelModel.description, color = Color.Gray, fontSize = 14.sp)
        }
        Spacer(modifier = modifier.weight(1f))
        Button(
            onClick = {
                isFollowing = !isFollowing
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = if (isFollowing) {
                    Color.Gray
                } else {
                    colorResource(id = R.color.light_green)
                }
            ),
            modifier = modifier
                .padding(8.dp)
                .height(36.dp)
        ) {
            Text(
                text = if (isFollowing) {
                    "Following"
                } else {
                    "Follow"
                },
                color = if (isFollowing) {
                    Color.Black
                } else {
                    Color.White
                },   
                fontWeight = FontWeight.Bold
            )
        }
    }
}