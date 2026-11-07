package week01_arrays_hashmaps

/*
 * Problem: 347. Top K Frequent Elements (LeetCode)
 *
 * Given an integer array `nums` and an integer `k`, return the k most
 * frequent elements. Answer may be in any order.
 */
class P0347TopKFrequent {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        var mapCount = HashMap<Int, Int>()


        for (end in nums.indices)
        {
            var key = nums[end]
            if(mapCount.containsKey(key))
            {
                mapCount[key] =  mapCount[key]!! + 1
            }
            else
            {
                mapCount[key] =   1
            }
        }

        return mapCount.entries.sortedByDescending { it.value }.take(k).map { (k,v) -> k }.toIntArray()
    }
}
