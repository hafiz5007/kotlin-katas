package week01_arrays_hashmaps

/*
 * Problem: 1. Two Sum (LeetCode)
 *
 * Given an array of integers `nums` and an integer `target`, return the
 * indices of the two numbers that add up to `target`.
 */
class P0001TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        var checkedDataMap  = mutableMapOf<Int, Int>()


        for (i in 0 until nums.size) {
            // Your code here
            val complement = target -  nums[i];


            if(checkedDataMap.containsKey(complement))
            {
                return intArrayOf(checkedDataMap.getValue (complement), i)
            }


            checkedDataMap[nums[i]] = i

        }

        return  intArrayOf();
    }
}





//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var nums = intArrayOf(2,7,11,15)
    var target = 9

    var resultArray = P0001TwoSum().twoSum(nums, target)

    for (r in resultArray.indices)
    println(resultArray[r])
}