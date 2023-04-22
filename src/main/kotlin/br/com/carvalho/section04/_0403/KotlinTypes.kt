package br.com.carvalho.section04._0403

fun main() {

    val myInt = 199
    val aInt: Int = 7

    //java
    //int lowest = (myInt < aInt)? myInt : aInt

    //kotlin
    val lowest = if (myInt < aInt) myInt else aInt


    val temp = 25

    val isAirConditioneerOn = if( temp >= 26){
        println("It is warm")
        true
    } else{
        println("It isn't so warm")
        false
    }

    println("Is the air conditioner on: $isAirConditioneerOn")

}