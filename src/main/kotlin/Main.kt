fun main(args: Array<String>) {
    /*println(isPalindrome(123))
    println(isPalindrome(121))
    println(isPalindrome(-121))
    println(isPalindrome(1112111))
    println(isPalindrome(1))*/
    //println(isPalindrome(10022201))
    println(5423 % 234)
}

fun isPalindrome(x: Int): Boolean {
    if (x < 0) {
        return false
    } else if (x == 0) return true
    var num = x
    val array: ArrayList<Int> = arrayListOf()
    while (num/10.00 < 1) {
        array.add(num%10)
        num /= 10
    }
    for (i in array.indices) {
        if (array[i] != array[array.size - i - 1]) {
            return false
        }
    }
    println(array)
    return array.isNotEmpty()
}