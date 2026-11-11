package week02_linkedlists_stacks

/*
 * Problem: 739. Daily Temperatures (LeetCode)
 *
 * Return answer[] where answer[i] is the number of days you have to wait
 * after the ith day to get a WARMER temperature. 0 if never.
 */

//Given an array of integers temperatures represents the daily temperatures,
// return an array answer such that answer[i] is the number of days you have to wait after the ith day
// to get a warmer temperature. If there is no future day for which this is possible,
// keep answer[i] == 0 instead.


//my aproach
//i will take mutablelist for retrun data and also
// for loop for until check and also will check thedifferent that will be while another loop

class P0739DailyTemperatures {
    fun dailyTemperatures(temperatures: IntArray): IntArray {

        val ans = IntArray(temperatures.size) // Initializes with 0 by default
        val stack = java.util.Stack<Int>() // Stores indices of the temperatures

        for (i in temperatures.indices) {
            // While stack is not empty and current day is warmer than the day at the top of the stack
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                val prevIndex = stack.pop()
                ans[prevIndex] = i - prevIndex // The wait time is the difference in indices
            }
            stack.push(i) // Push the current day's index onto the stack
        }

        return ans


    }
}



fun main() {

    val  temperatures = intArrayOf(73,74,75,71,69,72,76,73)


    var results = P0739DailyTemperatures().dailyTemperatures(temperatures)

    for (result in results)
        println(result)

}


