package com.pkj.wow.dsa.leetcode_blind75.string

/**
 * Leetcode: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 */
fun lenghtOfLongestSubString(s: String): Int{
    var max = 0
    var windowStart = 0
    var set = mutableSetOf<Char>()

    for(windowEnd in s.indices){
        while(set.contains(s[windowEnd]) == true){
            set.remove(s[windowStart])
            windowStart++
        }
        set.add(s[windowEnd])
        max = maxOf(max, (windowEnd-windowStart+1))
    }


    return max
}


fun main(){
    println(lenghtOfLongestSubString("abcabcbb"))
    println(lenghtOfLongestSubString("pwwkew"))
}