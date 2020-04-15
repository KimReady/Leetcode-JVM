class Solution {
    fun intToRoman(num: Int): String {
        var number = num
        val dividers = intArrayOf(1000, 500, 100, 50, 10, 5, 1)
        val romans = arrayOf("M", "D", "C", "L", "X", "V", "I")
        val sb = StringBuilder()
        var idx = 0
        while (number > 0) {
            val share = number / dividers[idx]
            number %= dividers[idx]
            if (share == 4) {
                if (sb.isNotEmpty() && sb.substring(sb.length - 1) == romans[idx - 1]) {
                    sb.deleteCharAt(sb.length - 1)
                    sb.append(romans[idx])
                    sb.append(romans[idx - 2])
                } else {
                    sb.append(romans[idx])
                    sb.append(romans[idx - 1])
                }
            } else if (share > 0) {
                sb.append(romans[idx].repeat(share))
            }
            idx++
        }
        return sb.toString()
    }
}