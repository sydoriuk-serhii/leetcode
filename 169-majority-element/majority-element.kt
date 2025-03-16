class Solution {
    fun majorityElement(nums: IntArray): Int  {

        nums.sort()

        var count = 0
        var lastValue = 0

        nums.forEachIndexed { index, it ->
            if (index < 1) {
                count++
                lastValue = it
            } else if (lastValue == it) {
                count++
            } else if (it == nums[index - 1] && count > 0) {
                count--
            }

            if (count <= 0) {
                lastValue = it
            }
        }
        return lastValue
    }
}