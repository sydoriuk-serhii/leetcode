class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int{
        var count = 0
        nums.forEachIndexed { index, value ->
            if (value != `val`) {
                nums[count] = value
                count++
            }
        }
    
        
        return count
    }
}