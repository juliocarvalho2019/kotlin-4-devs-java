package br.com.carvalho.section04._0407

fun main() {
    println("10 + 20 = ${myMathFunction(10, 20)}")
    println("10 + 20 = ${myExpressionBodyFunction(15, 25)}")
    println("10 + 20 = ${myExpressionBodyFunctionWithInferent(15, 25)}")
    println("10 + 20 = ${myFunctionWithDefaults(10, 10)}")
    println("10 + 20 = ${myFunctionWithDefaults(10, 10, "Hello")}")
    println("10 + 20 = ${myFunctionWithDefaults(message = "Hello")}")
    println("Default SUM = ${myFunctionWithDefaults(message = "Hello")}")
}
fun myMathFunction(number1: Int, number2: Int): Int {
    return number1 + number2
}
fun myExpressionBodyFunction(number1: Int, number2: Int): Int = number1 + number2
fun myExpressionBodyFunctionWithInferent(number1: Int, number2: Int) = number1 + number2

fun myFunctionWithDefaults(number1: Int = 1, number2: Int = 5, message: String ="Hi"): Int{
    val results = number1 + number2
    println(message)

    return results
}

