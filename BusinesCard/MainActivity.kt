package com.example.businescard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.businescard.ui.theme.BusinesCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinesCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {

                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun preview(){
    BusinessCard(name = "Name", phone = "123-456-789", email = "example@mail.com")
}


@Composable
fun BusinessCard(name: String, phone: String, email: String, modifier: Modifier = Modifier){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        //verticalArrangement = Arrangement.Center,

    ) {

        Text(text = "", Modifier.weight(1f))

        Text(
            text = name,
            fontSize = 48.sp,
            modifier = Modifier
                .weight(1f)
        )
        InfoPanel(
            phone = phone,
            email = email,
            modifier = Modifier
                .weight(0.2f)
        )

    }

}

@Composable
fun InfoPanel(phone: String, email: String, modifier: Modifier) {
    Column (modifier = modifier){
        Text(
            text = phone
        )

        Text(
            text = email
        )
    }
}
