package com.example.funfacts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.funfacts.ui.theme.FunfactsTheme
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : ComponentActivity() {

    private val factsList = listOf(
        "A cloud weighs around a million tonnes.",
        "Your brain is constantly eating itself.",
        "The largest piece of fossilised dinosaur poo discovered is over 30cm long and over two litres in volume.",
        "The Universe's average colour is called 'Cosmic latte'.",
        "Animals can experience time differently from humans.",
        "Water might not be wet.",
        "All the world’s bacteria stacked on top of each other would stretch for 10 billion light-years.",
        "The fear of long words is called Hippopotomonstrosesquippedaliophobia.",
        "The world’s oldest dog lived to 29.5 years old.The Sun makes a sound but we can't hear it."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val factTextView = findViewById<TextView>(R.id.factTextView)
        val nextFactButton = findViewById<Button>(R.id.nextFactButton)

        // Display a random fact when the app opens
        factTextView.text = getRandomFact()

        // Display a new fact when the 'Next Fact' button is clicked
        nextFactButton.setOnClickListener {
            factTextView.text = getRandomFact()
        }
    }

    // Function to get a random fact from the list
    private fun getRandomFact(): String {
        return factsList[Random.nextInt(factsList.size)]
    }



}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FunfactsTheme {
        Greeting("Android")
    }
}