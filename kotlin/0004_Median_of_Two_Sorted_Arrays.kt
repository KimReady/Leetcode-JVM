class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val fullLength = nums1.size + nums2.size
        val midCount = 2 - fullLength % 2
        var cnt = fullLength shr 1

        var mid = 0.0
        var i = 0
        var j = 0

        while (cnt >= 0) {
            val tmpMid: Int =
                if (i < nums1.size && j < nums2.size) {
                    if (nums1[i] > nums2[j]) nums2[j++] else nums1[i++]
                } else {
                    if (i >= nums1.size) nums2[j++] else nums1[i++]
                }

            if (cnt < midCount) {
                mid += tmpMid.toDouble()
            }
            cnt--
        }
        return mid / midCount
    }
}