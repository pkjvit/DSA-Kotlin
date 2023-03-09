package com.pkj.wow.dsa.leetcode_blind75.string

/*
Given string list : [hello, world!, C, na]
encode string: 5#hello6#world!1#C2#na
decode string: [hello, world!, C, na]
 */

const val DELIMITER = '#'
fun encodeString(words: List<String>): String{
    var result = ""
    for(word in words){
        result += word.length.toString() + DELIMITER + word
    }
    return result
}

fun decodeString(string: String): List<String>{
    var result = mutableListOf<String>()
    var i = 0
    while(i<string.length){
        var j=i+1
        while (string[j].equals(DELIMITER).not()){
            j++
        }
        var length = string.substring(i,j).toInt()
        result.add(string.substring(j+1, j+1+length))
        i = j + 1 + length
    }
    return result
}

fun main(){
    var encodedString = encodeString(listOf("hello","world!","C","na"))
    println(encodedString)
    println(decodeString(encodedString))
}