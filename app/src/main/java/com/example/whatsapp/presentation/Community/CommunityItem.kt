package com.example.whatsapp.presentation.Community

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R
import com.example.whatsapp.presentation.Community.model.CommunityData

@Composable
fun CommunityItem(modifier: Modifier = Modifier,
                  communityData :CommunityData) {
    Row (
        modifier = modifier.fillMaxWidth()
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Image(painter = painterResource(
            id = communityData.image
        ),
            contentDescription = null,
            modifier = Modifier.size(60.dp)
        )

        Spacer(modifier = modifier.width(12.dp))
        Column {
            Text(text =communityData.name, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(text = communityData.memberCount, fontSize = 14.sp, color =  Color.Gray)
        }
    }


}