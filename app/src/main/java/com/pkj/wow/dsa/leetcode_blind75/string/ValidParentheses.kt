package com.pkj.wow.dsa.leetcode_blind75.string

/*
https://leetcode.com/problems/valid-parentheses/

Input: s = "()[]{}"  // "([]{})
Output: true

Input: s = "(]" // "}(){"
Output: false

 */

fun isValid(s: String): Boolean {
    var mapP = mapOf(')' to '(','}' to '{', ']' to '[')
    var stack = ArrayDeque<Char>()
    if(s.isEmpty() || mapP.containsKey(s[0])){
        return false
    }
    for(c in s){
        if(mapP.containsKey(c)){
            if(stack.isEmpty() || !stack.last().equals(mapP.get(c))){
                return false
            }else{
                stack.removeLast()
            }
        }else{
            stack.addLast(c)
        }
    }

    return true
}


fun main(){
    println(isValid("([]{})"))
    println(isValid("()[]{}"))
    println(isValid("(]"))
    println(isValid("}(){"))
    println(isValid("()"))
}


