package com.example.rockpaperscissors

fun main(){
    var computerChoice = ""
    var playerChoice  = ""
    println("Rock, Paper or Scissors? Enter your choice.")

    var rightInput = false
    while (!rightInput){
        playerChoice = readln().lowercase()
        when {
            playerChoice == "rock" -> rightInput = true
            playerChoice == "paper" -> rightInput = true
            playerChoice == "scissors" -> rightInput = true
            else -> println("Please enter a valid choice")
        }
    }


    var randomNumber = (1..3).random()

    val rock = 1
    val paper = 2
    val scissors = 3

    if (randomNumber == 1){
        computerChoice = "rock"
    } else if (randomNumber == 2){
        computerChoice = "paper"
    } else if(randomNumber == 3){
        computerChoice = "scissors"
    }
    if (playerChoice == "rock" &&computerChoice == "paper"){
       println(computerChoice)
        println("You picked $playerChoice and I picked $computerChoice,you lose")
    }else if(playerChoice == "rock" &&computerChoice == "scissors"){
        println(computerChoice)
        println("You picked $playerChoice and I picked $computerChoice, you win!")
    } else if (playerChoice == "rock" &&computerChoice == "rock"){
        println(computerChoice)
        println("We both picked rock, its a draw :(")


         } else if(playerChoice == "paper" &&computerChoice == "rock"){
            println(computerChoice)
            println("You picked $playerChoice and I picked $computerChoice, you win!")
        } else if(playerChoice == "paper" &&computerChoice == "paper"){
            println(computerChoice)
            println("We both picked paper, its a draw :(")
        } else if (playerChoice == "paper" &&computerChoice == "scissors"){
            println(computerChoice)
            println("You picked $playerChoice and I picked $computerChoice, you lose")


            } else if(playerChoice == "scissors" &&computerChoice == "rock"){
                println(computerChoice)
                println("You picked $playerChoice and I picked $computerChoice, you lose")
            } else if (playerChoice == "scissors" &&computerChoice == "paper"){
                println(computerChoice)
                println("You picked $playerChoice and I picked $computerChoice, you win!")
            } else if (playerChoice == "scissors" &&computerChoice == "scissors"){
                println(computerChoice)
                println("we both picked scissors, its a draw")
    }
}