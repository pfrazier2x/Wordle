# Wordle

Submitted by: **Preston Frazier**

## About the App

**Wordle** is a simple Android word-guessing game built with Kotlin. The app gives the user three chances to guess a randomly selected four-letter word. After each guess, the app displays feedback showing whether each letter is correct, misplaced, or not included in the target word.

## Required Features

The following required functionality is completed:

- [x] User has 3 chances to guess a random 4-letter word.
- [x] After 3 guesses, the user can no longer submit another guess.
- [x] After each guess, the user sees the correctness of the guess.
- [x] After all 3 guesses are taken, the target word is displayed.

### Guess Feedback

The app uses the following symbols to show the correctness of each guess:

- `O` = correct letter in the correct position
- `+` = correct letter in the wrong position
- `X` = letter is not in the target word

For example, if the target word is `STAR` and the user guesses `SAIL`, the result would be:

`O+XX`

## Video Walkthrough

Here is a walkthrough of the completed Wordle app:

<img src="wordle_walkthrough.gif" width="300" alt="Wordle App Walkthrough">

GIF OF PHONE VIEW

<img width="400" height="968" alt="Screen Recording 2026-09-01 at 12 30 18 PM (1)" src="https://github.com/user-attachments/assets/6f72f1fa-8791-4fb3-a9c2-ec5f8bb959c4" />






FULL VIDEO 

<img width="400" height="260" alt="WORDLE - PRESTON FRAZIER (1)" src="https://github.com/user-attachments/assets/73474eca-76d6-4d1c-8742-d3ccfa448216" />






## How the App Works

1. A random four-letter word is selected when the app starts.
2. The user enters a four-letter guess.
3. The app converts the guess to uppercase and checks it against the target word.
4. The app displays the guess and its result using `O`, `+`, and `X`.
5. The user can make up to three guesses.
6. After the third guess, the Submit button is disabled and the correct answer is displayed.

## Built With

- Kotlin
- Android Studio
- XML
- ConstraintLayout

## Notes

One challenge was connecting the random four-letter word list to the main activity and correctly displaying the results after each guess. I also made sure the user could not continue submitting guesses after the third attempt.

## License

    Copyright 2026 Preston Frazier

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
