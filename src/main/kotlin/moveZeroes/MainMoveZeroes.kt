package moveZeroes

fun main() {
    for (i in moveZeroes(intArrayOf(0,1,0,3,12))) { // [1,3,12,0,0]
        print("$i ")
    }
    println()
    for (i in moveZeroes(intArrayOf(0))) { // [0]
        print("$i ")
    }
    println()
    for (i in moveZeroes(intArrayOf(0,0,1,2,3))) { // [1,2,3,0,0]
        print("$i ")
    }
    println()
    for (i in moveZeroes(intArrayOf(1,2,3,0,0))) { // [1,2,3,0,0]
        print("$i ")
    }
}

/**
 * Перенести все 0 вправо с сохранением порядка
 * Левый указатель ищёт 0, правый не 0
 */
fun moveZeroes(nums: IntArray): IntArray {
    var l = 0
    var r = 1
    var transfer = 0

    while (r < nums.size) {
        if (nums[l] == 0 && nums[r] != 0) {
            transfer = nums[l]
            nums[l] = nums[r]
            nums[r] = transfer
        } else if (nums[l] == 0 && nums[r] == 0) {
            r++
        }
        if (nums[l] != 0) {
            l++
            r = l + 1
        }
    }

    return nums
}
