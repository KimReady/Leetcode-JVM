class Solution {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) {
            return s
        }

        val sb = StringBuilder()
        val len = s.length
        val lastRow = numRows - 1
        val longest = 2 * lastRow

        for (i in 0 until numRows) {
            var fromBelow = true
            var j = i
            while (j < len) {
                sb.append(s[j])

                if (i in 1 until lastRow) {
                    j += if (fromBelow) 2 * (lastRow - i) else 2 * i
                    fromBelow = !fromBelow
                } else {
                    j += longest
                }
            }
        }
        return sb.toString()
    }
}