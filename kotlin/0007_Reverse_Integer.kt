class Solution {
    fun reverse(x: Int): Int {
        val str = x.toString()
        val res = if (str[0] != '-') {
            str.reversed().toLong()
        } else {
            str.substring(1).reversed().toLong() * -1
        }

        return if (Int.MIN_VALUE < res && res < Int.MAX_VALUE) res.toInt() else 0
    }
}
