package com.myfirstapplication.my2ndquiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.myfirstapplication.my2ndquiz.ui.theme.My2ndQuizTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            My2ndQuizTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PhoneDialer()
                }
            }
        }
    }
}

@Composable
fun PhoneDialer() {
    Column(modifier = Modifier.fillMaxSize()) {

        Row(modifier = Modifier
            .fillMaxWidth(1f)
            .height(50.dp)
            .background(Color(78, 166, 46))) {
            Column ( modifier = Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "Recent", textAlign = TextAlign.Center, modifier = Modifier.padding(8.dp),
                    fontWeight = FontWeight.Bold, fontSize = 25.sp
                )
            }
            Spacer(modifier = Modifier.width(6.dp))

            Column (modifier = Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "Favorites", textAlign = TextAlign.Center, modifier = Modifier.padding(8.dp),
                    fontWeight = FontWeight.Bold,fontSize = 25.sp
                )
            }
            Spacer(modifier = Modifier.width(6.dp))
            Column (modifier = Modifier.weight(1f),horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "Contacts", textAlign = TextAlign.Center, modifier = Modifier.padding(8.dp),
                    fontWeight = FontWeight.Bold,fontSize = 25.sp
                )
            }
        }

            Row(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .fillMaxHeight(0.5f) ,


                ) {
                Column(
                    modifier = Modifier
                        .background(color = Color.White),
                    horizontalAlignment = Alignment.CenterHorizontally,verticalArrangement = Arrangement.Bottom,

                ) {
                    Text(
                        text = "Enter Your number Here!   ", fontSize = 30.sp,
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier
                            .padding(top = 300.dp)
                            .border(BorderStroke(1.dp, Color.Black))
                            .background(Color.Green)
                        )
                }
                Spacer(modifier = Modifier.width(8.dp))
            }



        Row(modifier = Modifier.fillMaxHeight(0.2f)) {

            Column(modifier = Modifier.weight(1f),horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "1", fontSize = 30.sp, fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column (modifier = Modifier.weight(1f),horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "2", fontSize = 30.sp,fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column ( modifier = Modifier.weight(1f),horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "3", fontSize = 30.sp,fontWeight = FontWeight.Bold)
            }
        }
        Row(modifier = Modifier.fillMaxHeight(0.2f)) {
            Column(modifier = Modifier.weight(1f),horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "4", fontSize = 30.sp,fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column ( modifier = Modifier.weight(1f),horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "5", fontSize = 30.sp,fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column ( modifier = Modifier.weight(1f),horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "6", fontSize = 30.sp,fontWeight = FontWeight.Bold)
            }
        }
        Row(modifier = Modifier.fillMaxHeight(0.3f)) {
            Column(modifier = Modifier.weight(1f),horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "7", fontSize = 30.sp,fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column (modifier = Modifier.weight(1f),horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "8", fontSize = 30.sp,fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column (modifier = Modifier.weight(1f),horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "9", fontSize = 30.sp,fontWeight = FontWeight.Bold)
            }
        }
        Row(modifier = Modifier.fillMaxHeight(0.5f)) {
            Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "*", fontSize = 30.sp,fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column ( modifier = Modifier.weight(1f),horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "0", fontSize = 30.sp,fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column (modifier = Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "#", fontSize = 30.sp,fontWeight = FontWeight.Bold)
            }
        }
        Row(modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),horizontalArrangement = Arrangement.Center) {
            Image(painter = painterResource(id = R.drawable.baseline_local_phone_24), contentDescription = "Phone",
                modifier = Modifier
//                    .background(Color(78, 166, 46))
                    .size(50.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PhoneDialerPreview() {
    My2ndQuizTheme {
        PhoneDialer()
    }
}