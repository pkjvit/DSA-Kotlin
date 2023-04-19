package com.pkj.wow.template

import com.pkj.wow.CONDITION
import com.pkj.wow.DO_LOGIC

fun slidingWindow(array: IntArray): Int{
    var result = 0
    var windowStart = 0
    var windowSum = 0

    for(windowEnd in 0 until array.size){

        DO_LOGIC()
        windowSum += array[windowEnd]


        while(CONDITION()){ // window condition broken
            DO_LOGIC() // remove array[windowStart] from sum
            windowSum -= array[windowStart]
            windowStart++
        }

        // update result
    }

    return  result
}