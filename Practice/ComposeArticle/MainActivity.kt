package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Article(
                        modifier = Modifier
                            .padding(start = 16.dp, end = 16.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun Article(modifier: Modifier) {
    Column() {
        val banner = painterResource(id = R.drawable.bg_compose_background)

        Image(
            painter = banner,
            contentDescription = null
        )
        Text(
            text = stringResource(id = R.string.Title),
            fontSize = 24.sp,
            modifier = modifier
                .padding(top = 16.dp, bottom = 16.dp)
        )
        Text(
            text = stringResource(id = R.string.p1),
            textAlign = TextAlign.Justify,
            modifier = modifier
        )
        Text(
            text = stringResource(id = R.string.p2),
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(top = 16.dp, bottom = 16.dp)
        )

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ArticlePreview() {
    ComposeArticleTheme {
        Article(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        )
    }
}