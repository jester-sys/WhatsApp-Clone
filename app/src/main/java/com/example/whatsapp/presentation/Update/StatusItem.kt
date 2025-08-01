package com.example.whatsapp.presentation.Update

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R
import com.example.whatsapp.presentation.Update.model.StatusData

@Composable
@Preview(showSystemUi = true)
fun MyStatus(modifier: Modifier = Modifier) {

    Row (
        modifier = modifier
            .fillMaxWidth()
            .padding(12.dp), verticalAlignment = Alignment.CenterVertically
    ){
        Box() {
            Image(
                painter = painterResource(R.drawable.sharukhkhan),
                contentDescription = null,
                modifier = Modifier
                    .size(60.dp)
                    .clip(shape = CircleShape)
            )
            Icon(
                painter = painterResource(R.drawable.baseline_add_24),
                contentDescription = null,
                tint = Color.White,
                modifier = modifier
                    .size(25.dp)
                    .align(Alignment.BottomEnd)
                    .padding(2.dp)
                    .background(
                        color = colorResource(id = R.color.light_green),
                        shape = RoundedCornerShape(12.dp)
                    )
            )


        }

        Spacer(modifier = modifier.width(12.dp))
        Column {
            Text(text = "My Status",
                fontWeight = FontWeight.Bold, fontSize = 16.sp )
            Text(text = "Tap to add status update", color = Color.Gray,
                fontSize = 14.sp)

        }
    }


}

@Composable
fun StatusItem(modifier: Modifier = Modifier,
               statusData: StatusData) {

    Row(
        modifier = Modifier.fillMaxWidth().padding(horizontal =12.dp, vertical = 8.dp ),
        verticalAlignment = Alignment.CenterVertically
    ){
       Image(painter = painterResource(id = statusData.image),
           contentDescription = null,
           modifier = modifier.size(60.dp)
               .padding(4.dp)
               .clip(CircleShape),
           contentScale = ContentScale.Crop)

        Column {
            Text(text = statusData.name, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(text = statusData.time, fontSize = 16.sp, color = Color.Gray)
        }
    }

}