package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview() {
    Quadrant(modifier = Modifier)
}

@Composable
fun Quadrant(modifier: Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            Card(
                title = stringResource(R.string.title1),
                message = stringResource(R.string.msg1),
                Color(0xFFEADDFF),
                modifier = Modifier
                    .weight(1f)
            )
            Card(
                title = stringResource(R.string.title2),
                message = stringResource(R.string.msg2),
                Color(0xFFD0BCFF),
                modifier = Modifier
                    .weight(1f)
            )
        }
        Row(
            modifier = Modifier.weight(1f)
        ) {
            Card(
                title = stringResource(R.string.title3),
                message = stringResource(R.string.msg3),
                Color(0xFFB69DF8),
                modifier = Modifier
                    .weight(1f)
            )
            Card(
                title = stringResource(R.string.title4),
                message = stringResource(R.string.msg4),
                Color(0xFFF6EDFF),
                modifier = Modifier
                    .weight(1f)
            )
        }

    }
}

@Composable
fun Card(title: String, message: String, color: Color, modifier: Modifier = Modifier){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .background(color = color)
            .padding(16.dp)

    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = message,
            textAlign = TextAlign.Justify
        )
    }

}