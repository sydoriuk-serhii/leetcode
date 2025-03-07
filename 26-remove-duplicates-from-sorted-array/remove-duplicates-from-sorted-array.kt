class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var count = 0
        nums.forEachIndexed { index, value ->
            if (index == 0) {
                count++; return@forEachIndexed
            }

            if (nums[index - 1] != value) {
                nums[count] = value; count++
            }


        }

        return count
    }
}