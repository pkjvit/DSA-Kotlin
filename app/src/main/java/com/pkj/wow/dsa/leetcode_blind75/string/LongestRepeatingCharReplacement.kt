package com.pkj.wow.dsa.leetcode_blind75.string

/**
 * https://leetcode.com/problems/longest-repeating-character-replacement/
 *
 * Input: s = "ABAB", k = 2
 * Output: 4
 * Explanation: Replace the two 'A's with two 'B's or vice versa.
 *
 *
 */
fun longestRepeatingCharReplacement2(s:String, k:Int): Int{
    var result = 0
    var count = mutableMapOf<Char, Int>()
    var windowLeft = 0
    var maxFrequency = 0

    for(windowRight in s.indices){
        count[s[windowRight]] = count.getOrDefault(s[windowRight],0) +1
        maxFrequency = maxOf(maxFrequency, count[s[windowRight]]!!)

        while( (windowRight-windowLeft+1) - maxFrequency > k){
            count[s[windowLeft]] = count[s[windowLeft]]!! - 1
            windowLeft++
        }


        result = maxOf(result, windowRight-windowLeft+1)

    }

    return result
}

fun longestRepeatingCharReplacement(s:String, k:Int): Int{
    var result = 0
    var count = mutableMapOf<Char, Int>()
    var windowLeft = 0

    for(windowRight in s.indices){
        count[s[windowRight]] = count.getOrDefault(s[windowRight],0) +1

        while( (windowRight-windowLeft+1) - count.values.max() > k){
            count[s[windowLeft]] = count[s[windowLeft]]!! - 1
            windowLeft++
        }


        result = maxOf(result, windowRight-windowLeft+1)

    }

    return result
}

fun main(){
    println(longestRepeatingCharReplacement("ABAB", 2))
    println(longestRepeatingCharReplacement("ABABBA", 2))
    println(longestRepeatingCharReplacement2("ABAB", 2))
    println(longestRepeatingCharReplacement2("ABABBA", 2))
}