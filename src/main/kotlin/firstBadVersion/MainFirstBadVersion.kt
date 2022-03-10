package firstBadVersion


fun main() {
    println(firstBadVersion(2126753390))
}

fun isBadVersion(n: Int): Boolean {
    if (n >= 1702766719) return true
    return false
}

/**
 * Функция поиска первого потходящего (Левый бинпоиск)
 */
fun firstBadVersion(n: Int) : Int {
    var left: Long = 0
    var right: Long = n.toLong()

    while (right > left) {
        val center = (left + right) / 2 // При использовании Int переполнение, нужен Long
        if (isBadVersion(center.toInt())) {
            right = center
        } else {
            left = center + 1
        }
    }

    return left.toInt()
}