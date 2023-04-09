package ru.otus.homework

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FizzbuzzTest {

    @Test
    fun `testcase 1`() {
        val expected = emptyArray<String>()
        val actual = fizzbuzz(0)
        assertArrayEquals(expected,actual)
    }

    @Test
    fun `testcase 2`() {
        val expected = arrayOf(
            "FizzBuzz",
            "1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7",
            "8",
            "Fizz",
            "Buzz",
            "11",
            "Fizz",
            "13",
            "14"
        )
        val actual = fizzbuzz(15)
        assertArrayEquals(expected,actual)
    }
}