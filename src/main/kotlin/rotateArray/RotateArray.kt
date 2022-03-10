package rotateArray

fun main() {
    for (i in rotate(intArrayOf(1,2,3), 4)) { // [3,1,2]
        print("$i ")
    }
    println()
    for (i in rotate(intArrayOf(1,2,3,4,5,6,7), 3)) { // [5,6,7,1,2,3,4]
        print("$i ")
    }
}

/**
 * Очень медленное решение.
 * 2 указателя.
 * l - стоит на месте. r - бегает по массиву.
 * Всё это повторяется k - раз
 */
fun rotate(nums: IntArray, k: Int): IntArray {
    val l = 0
    var transfer = 0
    repeat(k) {
        for (r in nums.indices) {
            transfer = nums[l]
            nums[l] = nums[r]
            nums[r] = transfer
        }
    }

    return nums
}