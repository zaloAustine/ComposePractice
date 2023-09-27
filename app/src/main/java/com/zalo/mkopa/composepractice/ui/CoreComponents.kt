package com.zalo.mkopa.composepractice.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zalo.mkopa.composepractice.ui.theme.ComposePracticeTheme

/**
Created by zaloaustine in 9/27/23.
 */
@Composable
fun MainScreen() {
    Surface(
        color = Color.LightGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround)
            {
                HorizontalColoredBar(Color.White)
                HorizontalColoredBar(Color.Green)
            }

            HorizontalColoredBar(Color.Magenta)
            HorizontalColoredBar(Color.Yellow)
            HorizontalColoredBar(Color.Cyan)
        }
    }
}

@Composable
fun HorizontalColoredBar(color: Color) {
    Surface(
        color = color,
        modifier = Modifier
            .size(height = 100.dp, width = 100.dp)
    ){}
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    ComposePracticeTheme {
        MainScreen()
    }
}