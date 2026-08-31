package com.example.wordle

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var guessCount = 0
    private lateinit var targetWord: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val guessInput = findViewById<EditText>(R.id.guessInput)
        val submitButton = findViewById<Button>(R.id.submitButton)

        val guess1 = findViewById<TextView>(R.id.guess1)
        val result1 = findViewById<TextView>(R.id.result1)

        val guess2 = findViewById<TextView>(R.id.guess2)
        val result2 = findViewById<TextView>(R.id.result2)

        val guess3 = findViewById<TextView>(R.id.guess3)
        val result3 = findViewById<TextView>(R.id.result3)

        val answerText = findViewById<TextView>(R.id.answerText)

        // Pick random word
        targetWord = FourLetterWordList.getRandomFourLetterWord()

        submitButton.setOnClickListener {

            val guess = guessInput.text.toString().uppercase()

            // Make sure the user entered 4 letters
            if (guess.length != 4) {
                Toast.makeText(
                    this,
                    "Enter a 4 letter word",
                    Toast.LENGTH_SHORT
                ).show()

                return@setOnClickListener
            }

            val result = checkGuess(guess, targetWord)

            guessCount++

            when (guessCount) {

                1 -> {
                    guess1.text = "Guess #1: $guess"
                    result1.text = "Result: $result"
                }

                2 -> {
                    guess2.text = "Guess #2: $guess"
                    result2.text = "Result: $result"
                }

                3 -> {
                    guess3.text = "Guess #3: $guess"
                    result3.text = "Result: $result"
                }
            }

            // Clear the box
            guessInput.text.clear()

            // Hide keyboard
            val keyboard =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

            keyboard.hideSoftInputFromWindow(
                guessInput.windowToken,
                0
            )

            // After 3 guesses, stop the game
            if (guessCount == 3) {

                submitButton.isEnabled = false

                answerText.text = "Answer: $targetWord"
                answerText.visibility = View.VISIBLE

                Toast.makeText(
                    this,
                    "No more guesses!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    private fun checkGuess(
        guess: String,
        target: String
    ): String {

        var result = ""

        for (i in guess.indices) {

            result += when {

                guess[i] == target[i] -> "O"

                target.contains(guess[i]) -> "+"

                else -> "X"
            }
        }

        return result
    }
}