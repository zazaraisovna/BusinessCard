package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFCB13C6)
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Column(
            modifier = modifier.padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var imagePainter = painterResource(R.drawable.pickedmedia1)
            Image(
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape),
                painter = imagePainter,
                alignment = Alignment.Center,
                contentDescription = null,
            )
            Text(
                text = stringResource(R.string.full_name),
                modifier = Modifier.padding(8.dp),
                fontSize = 26.sp,
                textAlign = TextAlign.Center,
                color = Color.White
            )
            Text(
                text = stringResource(R.string.title),
                modifier = Modifier.padding(8.dp),
                fontSize = 22.sp,
                textAlign = TextAlign.Center,
                color = Color.White
            )
        }
        Column(
            modifier = modifier
                .padding(20.dp)
        ){}
        Column(
            modifier = modifier.padding(16.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.Start
        ) {
            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically
            ){
                Icon(
                    Icons.Rounded.Phone,
                    contentDescription = "Phone",
                    modifier = modifier.size(16.dp),
                    tint = Color(0xFFF0EDF0)
                )
                Text(
                    text = stringResource(R.string.phone),
                    modifier = Modifier.padding(8.dp),
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                    color = Color(0xFFF0EDF0)
                )
            }

            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Rounded.Share,
                    contentDescription = "Telegram",
                    modifier = modifier.size(16.dp),
                    tint = Color(0xFFF0EDF0)
                )
                Text(
                    text = stringResource(R.string.telegram),
                    modifier = Modifier.padding(8.dp),
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                    color = Color(0xFFF0EDF0)
                )
            }
            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Rounded.Email,
                    contentDescription = "Email",
                    modifier = modifier.size(16.dp),
                    tint = Color(0xFFF0EDF0)
                )
                Text(
                    text = stringResource(R.string.email),
                    modifier = Modifier.padding(8.dp),
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                    color = Color(0xFFF0EDF0)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFFCB13C6)
        ) {
            Greeting("Android")
        }
    }
}