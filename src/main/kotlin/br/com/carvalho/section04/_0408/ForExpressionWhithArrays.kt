package br.com.carvalho.section04._0407

fun main() {
    var index = 0
    for (item in 10.rangeTo(20).step(2)){
        println("${++index}) $item, ")
    }
    println()

    for ((indx, item) in 10.rangeTo(20).step(2).withIndex()){
        println("${indx + 1} ) $item, ")
    }
    println()

    val myArray = arrayOf(10,20,30,40,50)

    for (item in myArray.indices){
        println("At index $item is ${myArray[item]}")
    }
    println()
}

