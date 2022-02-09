package com.example.myquizapp

data class Question(
    val id:Int,
    val questions : String,
    val image: Int,//we will be associating the image view with and number for being recognizable
    val optionOne : String,
    val optionTwo : String,
    val optionThree : String,
    val optionFour : String,
    val correctAnswer : Int
    )


