class Solution {
    fun majorityElement(nums: IntArray): Int {
        var candidate = 0
        var point = 0

        for (i in 0..nums.lastIndex) {

            if (point == 0) {
                candidate = nums[i]
            }

            if (nums[i] == candidate) {
                point++
            } else {
                point--
            }
        }
        return candidate
    }
}