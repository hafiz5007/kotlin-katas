package week01_arrays_hashmaps

/*
 * Problem: 49. Group Anagrams (LeetCode)
 *
 * Given an array of strings `strs`, group the anagrams together.
 * Return the groups in any order.
 */
class P0049GroupAnagrams {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {


        var result = mutableMapOf<String, MutableList<String>>();


        for (str in strs)
        {
            var sortedString  = str.toCharArray().sorted().joinToString ("")


            if(!result.containsKey(sortedString))
            {
                result[sortedString] = mutableListOf()
            }


            result[sortedString]?.add(str)


        }


        return  result.values.toList()


    }
}
