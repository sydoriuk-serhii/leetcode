class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var count = 0
        var hasDuplicat = false
        nums.forEachIndexed { index, value ->
            if (index == 0) {
                count++
                return@forEachIndexed
            }
            
            
            if (nums[index - 1] != value) {
                nums[count] = value
                count++
                hasDuplicat = false
            } else if (nums[index - 1] == value && !hasDuplicat ) {
                nums[count] = value
                count++
                hasDuplicat = true
            }
        }

        return count
    }
}