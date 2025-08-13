package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val numbersSize = numbers.size
    if (numbersSize < 1) throw IllegalArgumentException("Массив должен содержать хотя бы 2 элемента")
    numbers.forEachIndexed { index, it ->
        if (index == numbersSize - 1) throw IllegalArgumentException("Подходящих чисел не найдено")
        if (it + numbers[index + 1] == target) return intArrayOf(index, index + 1)
        for (i in index + 1 until numbersSize) {
            if (it + numbers[i] == target) {
                return intArrayOf(index, i)
            }
        }
    }
    throw IllegalArgumentException("Подходящих чисел не найдено")
}