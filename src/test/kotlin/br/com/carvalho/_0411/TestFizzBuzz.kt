package br.com.carvalho._0411

import br.com.carvalho.section04._0411.fizzBuzz
import org.junit.jupiter.api.Test


/*
private fun fizzBuzz(n: Int): List<String> {
    TODO("not implemented")
}
*/

class TestFizzBuzz {

    @Test
    fun `Calling fizzbuzz with "5" returns list with 5 items`() {
        fizzBuzz(5) shouldBeEqualTo listOf("1", "2", "Fizz", "4", "Buzz")
    }

    @Test
    fun `Calling fizzbuzz with 16 returns out the correct values`() {

        val list = listOf(
            "1", "2", "Fizz", "4", "Buzz", "Fizz",
            "7", "8", "Fizz", "Buzz", "11", "Fizz",
            "13", "14", "FizzBuzz", "16"
        )

        fizzBuzz(16) shouldBeEqualTo list
    }
}

private infix fun <E> List<E>.shouldBeEqualTo(listOf: List<E>) {

}
