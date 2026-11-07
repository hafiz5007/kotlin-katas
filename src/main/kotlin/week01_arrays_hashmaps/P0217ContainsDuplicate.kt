package week01_arrays_hashmaps

/*
 * Problem: 217. Contains Duplicate (LeetCode)
 *
 * Return true if any value appears at least twice in `nums`, false otherwise.
 */
class P0217ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {

        return  nums.groupBy {it}.entries.filter { (k, v)->
            v.count() > 1
        }.any()

    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var nums =intArrayOf(1,2,1,4)

    println(P0217ContainsDuplicate().containsDuplicate(nums))

}