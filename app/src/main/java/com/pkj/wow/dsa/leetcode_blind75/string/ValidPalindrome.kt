package com.pkj.wow.dsa.leetcode_blind75.string

/*
https://leetcode.com/problems/valid-palindrome/

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
and removing all non-alphanumeric characters, it reads the same forward and backward.
Alphanumeric characters include letters and numbers.

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

 */
fun isPalindrome(s:String) :Boolean{
    var windowStart = 0
    var windowEnd = s.length-1

    while(windowStart<=windowEnd){
        if(!s[windowStart].isLetter()){
            windowStart++
            continue
        }
        if(!s[windowEnd].isLetter()){
            windowEnd--
            continue
        }
        if(!s[windowStart].equals(s[windowEnd], true)){
            return false
        }else{
            windowStart++
            windowEnd--
        }
    }

    return true
}


fun main(){
    println(isPalindrome("Hi pank k#napi H"))
    println(isPalindrome(" "))
}