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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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

                    //avoid hard coding strings
                    GreetingImage(
                        message = stringResource(id = R.string.happy_birthday_text),
                        from = stringResource(id = R.string.signature_text),
                        modifier = Modifier
                    )

                }
            }
        }
    }
}

//Use @Composable to declare compose components
/**
 * creates a happy birthday text
 */
@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier){
    //Column, Row and Box are the common ways to arrange items
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier     //this modifier is passed down from function calls
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
                /* Always use Modifier instead of modifier */
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }

}

/**
 * preview the ui in editor
 */
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BirthdayCardPreview(){
    BirthdayCardTheme() {
        GreetingImage(message = "Happy Birthday!", from = "From: Foobar")

    }
}

/**
 * displays background image and Birthday text
 */
@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.androidparty)    //image declaration

    Box {       //box allows for element to be displayed on top of each other
        Image(             //elements declared first will be on the back
            painter = image,    //image is drawn
            contentDescription = null,   //voice description for the content
            contentScale = ContentScale.Crop,    //scales the picture to fit the whole screen
            alpha = 0.5f    //opacity
        )
        GreetingText(       //other composable functions can be called
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )

    }

}
