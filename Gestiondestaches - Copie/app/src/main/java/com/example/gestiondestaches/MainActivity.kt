package com.example.gestiondestaches

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gestiondestaches.ui.theme.GestionDesTachesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GestionDesTachesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainContent(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MainContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GreetingImage()
        Greeting()

    }
}

@Composable
fun Greeting( modifier: Modifier = Modifier) {
    Text(
        text = "All Task Completed",
        modifier = modifier.padding(top = 24.dp, bottom = 8.dp),
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
    )
    Text(
        text = "Nice work",
        modifier = modifier.padding(top = 4.dp, bottom = 8.dp),

        fontSize = 16.sp,
    )

}

@Composable
fun GreetingImage() {
    val image = painterResource(R.drawable.ic_task_completed)

    Image(
        painter = image,
        contentDescription = "All Task Completed",

    )
}

@Preview(showBackground = true)
@Composable
fun MainContentPreview() {
    GestionDesTachesTheme {
        MainContent()
    }
}