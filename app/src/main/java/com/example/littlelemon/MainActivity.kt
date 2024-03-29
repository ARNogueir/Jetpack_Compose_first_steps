package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Little Lemon",
                    fontSize = 32.sp,
                    color = Color(0xFFF4CE14)
                )
                Text(
                    text = "chicago",
                    fontSize = 32.sp,
                    color = Color(0xFFF4CE14)
                )
                Row() {
                    Button(
                        onClick = { /*TODO*/ },
                        border = BorderStroke(1.dp, Color.Red),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray)
                    ) {
                        Text(text = stringResource(R.string.app_name))
                    }
                }
            }
        }
    }
}


//eta coisa faz isto e isto
@Composable
fun RestaurantName(name: String, size: Int) {
    Text(text = "Hello $name!", fontSize = size.sp)
}