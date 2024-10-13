package com.example.learntogether

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
import androidx.compose.ui.tooling.preview.Preview
import com.example.learntogether.ui.theme.LearnTogetherTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextAlign


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun GreetingImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        )
        //integration du premier text
        Text(
            text = "Jackpact compose tutorial",
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            textAlign = TextAlign.Justify
        )
        // 3. integration
        Text(
            text = "jackpact compose tutorial is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI develppment on Android with less code",
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            textAlign = TextAlign.Justify
        )

        // 4. Third Text with margin
        Text(
            text = "In this tutorial, you build a simple UI component with declarative functions.\n" +
                    "You call Compose functions to say what elements you want and the Compose\n" +
                    "compiler does the rest. Compose is built around Composable functions. These\n" +
                    "functions let you define your app\\'s UI programmatically because they let you\n" +
                    "describe how it should look and provide data dependencies, rather than focus\n" +
                    "on the process of the UI\\'s construction, such as initializing an element and\n" +
                    "then attaching it to a parent. To create a Composable function, you add the\n" +
                    "@Composable annotation to the function name.",
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            textAlign = TextAlign.Justify
        )

    }


}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
