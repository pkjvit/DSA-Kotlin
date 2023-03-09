package com.pkj.wow.dsa.leetcode_blind75.string

/*
https://leetcode.com/problems/valid-anagram/description/

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Input: s = "anagram", t = "nagaram"
Output: true

Input: s = "rat", t = "car"
Output: false
 */
fun isAnagram(s: String, t: String): Boolean{
    if(s.length != t.length)
        return false

    var map = mutableMapOf<Char,Int>()

    for(i in s.indices){
        map.put(s[i], map.getOrDefault(s[i],0)+1)
    }

    for(j in t.indices){
        if(map.getOrDefault(t[j],0) > 0){
            map[t[j]] = map[t[j]]!! -1
        }else{
            return false
        }
    }
    return true
}


fun main(){
    println(isAnagram("ANAGRAM", "NARGAMA"))
    println(isAnagram("RAT", "CAR"))
}