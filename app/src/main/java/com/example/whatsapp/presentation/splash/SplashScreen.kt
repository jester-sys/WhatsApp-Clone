package com.example.whatsapp.presentation.splash



import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R


@Composable
@Preview(showSystemUi = true)
fun SplashScreen(modifier: Modifier = Modifier) {

    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.ic_whatsapp_icon),
            contentDescription = null,
            modifier = modifier.size(80.dp)
                .align(Alignment.Center)
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.align(Alignment.BottomCenter)
                .padding(bottom = 16.dp)
        ) {
            Text(text = "From",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,

                    ),

                )
            Row {
                Icon(painter = painterResource(R.drawable.ic_meta_icon),
                    contentDescription = null
                )
                Text(text = "Meta",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,

                        ),
                    modifier = modifier.align(Alignment.CenterVertically)


                    )

            }
        }


    }
}