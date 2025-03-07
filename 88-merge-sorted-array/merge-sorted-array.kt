class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): IntArray {
        for (i in m until nums1.size) {
            nums1[i] = nums2[i-m]
        }
        nums1.sort()
        return nums1
    }
}