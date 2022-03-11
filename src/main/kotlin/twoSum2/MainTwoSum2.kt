package twoSum2

fun main() {
    for (i in twoSum(intArrayOf(2,7,11,15), 9)) { // [1,2]
        print("$i ")
    }
    println()
    for (i in twoSum(intArrayOf(2,3,4), 6)) { // [1,3]
        print("$i ")
    }
    println()
    for (i in twoSum(intArrayOf(-1,0), -1)) { // [1,2]
        print("$i ")
    }
    println()
    for (i in twoSum(intArrayOf(5,25,75), 100)) { // [1,2]
        print("$i ")
    }
}

/**
 * Находит индексы+1 элементов сумма которых = target
 */
fun twoSum(numbers: IntArray, target: Int): IntArray {
    val result = IntArray(2)
    var l = 0
    var r = 1

    while (numbers[l] + numbers[r] != target) {
        if (numbers[l] + numbers[r] > target || r == numbers.size - 1) {
            l++
            r = l + 1
        } else {
            r++
        }
    }

    result[0] = l + 1
    result[1] = r + 1

    return result
}