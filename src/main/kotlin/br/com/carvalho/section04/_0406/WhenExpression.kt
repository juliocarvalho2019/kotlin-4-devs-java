package br.com.carvalho.section04._0406

fun main() {
    val pizzaOrdered = 8

    when (pizzaOrdered){
        0 -> println("Not hungry")
        1 -> println("Hungry")
        2 -> println("Very hungry")
        else -> println("Are you sure?")
    }


    when (pizzaOrdered){
        0 -> println("Not hungry")
        1,2 -> println("Hungry")
        3 -> println("Very hungry")
        else -> println("Are you sure?")
    }


    when (pizzaOrdered){
       Math.abs(pizzaOrdered) -> println("Order 0 or more pizzas")
        else -> println("Ordered less than 0")
    }

    when (pizzaOrdered){
        0 -> println("We need orders")
        in 1 ..2 -> println("Got some orders")
        in 5 ..9 -> println("Business is up")
        else -> println("Are you sure?")
    }

    when {
        pizzaOrdered <= 0 -> println("None ordered")
        pizzaOrdered % 2 == 1 -> println("Odd number ordered")
        pizzaOrdered % 2 == 0 -> println("Even number ordered")
    }

}

