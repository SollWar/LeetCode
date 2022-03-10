package squaresSortedArray

import kotlin.math.abs


fun main() {
    for (i in sortedSquares(intArrayOf(-4,-1,0,3,10))) { // [0,1,9,16,100]
        print("$i ")
    }
    println()
    for (i in sortedSquares(intArrayOf(-7,-3,2,3,11))) { // [4,9,9,49,121]
        print("$i ")
    }
}

/**
 * Через два указателя
 * Решение основано на том что по краям самые большие числа^2
 */
fun sortedSquares(nums: IntArray): IntArray {
    var l = 0
    var r = nums.size - 1

    var resultIndex = nums.size - 1 // Заполняем выходной массив с конца
    val result = IntArray(nums.size)

    while (l <= r) {
        val left = abs(nums[l])
        val right = abs(nums[r])

        // Если правый больше левого значит и его квадрат будет больше, записываем его в конец 2 массива
        result[resultIndex] = if (right > left) {
            r--
            right*right
        } else {
            l++
            left*left
        }
        resultIndex--
    }

    return result
}