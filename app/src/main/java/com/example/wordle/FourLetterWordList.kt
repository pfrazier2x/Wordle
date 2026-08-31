package com.example.wordle

object FourLetterWordList {

    private val words = listOf(
        "STAR",
        "FISH",
        "GAME",
        "CODE",
        "PLAY",
        "WORD",
        "BOOK",
        "TREE",
        "BIRD",
        "ROAD",
        "BALL",
        "BLUE",
        "FIRE",
        "MOON",
        "RAIN",
        "SHIP",
        "KING",
        "LION",
        "WOLF",
        "SNOW"
    )

    fun getRandomFourLetterWord(): String {
        return words.random()
    }
}