class Solution {
    fun maxArea(height: IntArray): Int {
        var maxArea = 0
        var left = 0
        var right = height.lastIndex
        while (left < right) {
            val area = Integer.min(height[left], height[right]) * (right - left)
            maxArea = Integer.max(maxArea, area)
            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }
        }

        return maxArea
    }
}