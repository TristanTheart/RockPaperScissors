package com.example.rockpaperscissors

fun main() {
    var computerChoice = ""
    var playerChoice = ""
    println("Rock, Paper or Scissors? Enter your choice.")

    var userInputValidate = false
    while (!userInputValidate) {
        playerChoice = readln().lowercase()
        when (playerChoice) {
            "rock" -> userInputValidate = true
            "paper" -> userInputValidate = true
            "scissors" -> userInputValidate = true
            else -> println("Choice is invalid. Please enter rock paper or scissors.")
        }
    }

    var randomNumber = (1..3).random()

    when (randomNumber) {
        1 -> {
            computerChoice = "rock"
        }

        2 -> {
            computerChoice = "paper"
        }

        3 -> {
            computerChoice = "scissors"
        }
    }
    println(computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "rock" && computerChoice == "scissors" -> "Player"
        playerChoice == "paper" && computerChoice == "rock" -> "Player"
        playerChoice == "scissors" && computerChoice == "paper" -> "Player"
        else -> "Computer"
    }
    if (winner == "Tie") {
        println("It is a tie")
    } else {
        println("$winner won!")
    }
}