package searchInsertPosition

fun main() {
    println(searchInsert(intArrayOf(1,3,5,6),5))
    println(searchInsert(intArrayOf(1,3,5,6),2))
    println(searchInsert(intArrayOf(1,3,5,6),7))
}

fun searchInsert(nums: IntArray, target: Int): Int {
    var l = 0
    var r = nums.size

    while (r > l) {
        val c = (l + r) / 2
        if (nums[c] > target) {
            r = c
        } else if (nums[c] < target) {
            l = c + 1
        } else return c
    }
    return l
}