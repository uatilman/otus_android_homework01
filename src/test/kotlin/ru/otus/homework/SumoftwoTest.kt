package ru.otus.homework

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class SumoftwoTest {

    @Test
    fun `testcase 1`() {
        val actual = sumOfTwo(intArrayOf(2, 7, 11, 15), 9)
        val expected = intArrayOf(0, 1)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun `testcase 2`() {
        val actual = sumOfTwo(intArrayOf(3, 2, 4), 6)
        val expected = intArrayOf(1, 2)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun `testcase 3`() {
        assertThrows<IllegalArgumentException> {
            sumOfTwo(intArrayOf(3, 2), 6)
        }
    }
}