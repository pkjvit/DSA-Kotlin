package com.pkj.wow.dsa.leetcode_blind75.array

fun reverseRecursion(inputString: String): String{
    return if(inputString == "") {
        ""
    } else {
        reverseRecursion(inputString.substring(1)) + inputString[0]
    }
}

fun reverseIterativeN(inputString: String):String {
    val charArray = inputString.toCharArray()
    for (i in 0 until charArray.size/2){ // run a for loop up to half of string size and swap the values last to first using temp var
        val temp = charArray[i]
        charArray[i] = charArray[charArray.size-i-1]
        charArray[charArray.size-i-1] = temp
    }
    return String(charArray)
}

fun reverseStringUsingExt(string: String) = string.reversed()

fun reverse(string: String): String{
    var result = ""
    for(i in string.length - 1 downTo 0){
        result += string[i]
    }
    return result
}

fun main(){
    println(reverse("hello world!"))
    println(reverseStringUsingExt("hello world!"))
    println(reverseIterativeN("hello world!"))
    println(reverseRecursion("hello world!"))

}
