package ru.otus.homework

// шаг 1 задачи пропущен, так как индексы массива по заданию соответствуют числам на указанных индексах
fun fizzbuzz(n: Int): Array<String> {
    return Array(n) {
        when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
    }
}