package com.example.birthdaycard

// It is important to keep the import section ordered alphabetically
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.magnifier
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme

/**
 * Main activity is where the program starts executing
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Function calls to be set here
                    GreetingImage(message = "Happy Birthday!", from = "From")

                }
            }
        }
    }
}

//Use @Composable to declare compose components
@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier){
    //Column, Row and Box are the common ways to arrange items
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = message,     //A variable can be set for the text
            fontSize = 100.sp,  //font size
            lineHeight = 116.sp,    //decides how much space does each line should take up
            textAlign = TextAlign.Center   //aligns the text in its container
        )
        Text(
            text = from,
            fontSize = 30.sp,
            modifier = Modifier     //another way to format text using modifiers
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BirthdayCardPreview(){
    BirthdayCardTheme() {
        GreetingImage(message = "Happy Birthday!", from = "A ee e")

    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.androidparty)

    Box {
        Image(
            painter = image,
            contentDescription = null
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )

    }

}
