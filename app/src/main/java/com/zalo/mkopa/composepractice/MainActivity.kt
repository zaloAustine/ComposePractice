package com.zalo.mkopa.composepractice

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zalo.mkopa.composepractice.ui.theme.ComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText("Android")
                }
            }
        }
    }
}


@Composable
fun GreetingText(name: String) {
    Text(
        text = "Hello $name!",
        modifier = Modifier
            .size(width = 240.dp, height = 280.dp)
            .padding(start = 12.dp, top = 8.dp)
            .fillMaxSize(0.5f) // fill half ofScreen
            .clickable { },// make view clickable
//        style = TextStyle(
//            color = Color.Blue,
//            fontWeight = FontWeight.SemiBold,
//            fontSize = 18.sp
//        )
        style = MaterialTheme.typography.displaySmall,
        fontWeight = FontWeight.SemiBold
    )
}

@Composable
fun GreetingButton(name: String) {
    Button(
        onClick = {},
        modifier = Modifier
            .padding(12.dp)
    )
    {
        Text(text = "Hello $name", color = Color.White)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposePracticeTheme {
        Box {
            GreetingText("Android")
            //GreetingButton("Button")
        }
    }
}