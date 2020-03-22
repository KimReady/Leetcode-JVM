class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val visited: MutableMap<Int, Int> = mutableMapOf()

        nums.forEachIndexed { i, num ->
            if (visited.containsKey(num)) {
                return@twoSum intArrayOf(visited[num]!!, i)
            }
            visited[target - num] = i
        }

        return intArrayOf()
    }
}