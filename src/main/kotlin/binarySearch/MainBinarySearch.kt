package binarySearch

fun main() {
    println(search(intArrayOf(-1, 0, 3, 5, 9, 12), 9))
}

/**
 * Бинарный поиск в числовом массиве
 * Левый бинпоиск - первое подходящее значение
 * Правый бинпоиск - последнее подходящее значение
 */
fun search(nums: IntArray, target: Int): Int {

    var left = 0
    var right = nums.size

    while (right > left) {
        val center = (left + right) / 2    // Левый бинарный поиск
        //  center = (left + right +1) / 2 // Правый бинарный поиск
        if (nums[center] > target) {
            right = center    // Левый бинарный поиск
            // left = center  // Правый бинарный поиск
        } else {
            left = center + 1      // Левый бинарный поиск
            // right = center - 1  // Правый бинарный поиск
        }
    }

    return left
}