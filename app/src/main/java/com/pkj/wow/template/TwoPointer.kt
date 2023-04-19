package com.pkj.wow.template

import com.pkj.wow.CONDITION
import com.pkj.wow.DO_LOGIC

/**
 *  Two Pointer : one input, opposite end
 */

fun twoPointer_1Input_oppEnd(list: IntArray): Int{
    var left = 0
    var right = list.size-1
    var result = 0

    while(left < right){
        DO_LOGIC()
        // result = modify as per logic

        if(CONDITION()){
            left ++
        }else{
            right --
        }
    }
    return result
}

/**
 *  Two Pointer : two input, exhaust both
 */

fun twoPointer_2Input_exhaustBoth(intArray1: IntArray, intArray2: IntArray): Int{
    var result = 0
    var i = 0
    var j = 0

    while(i < intArray1.size &&  j < intArray2.size){
        DO_LOGIC()

        if(CONDITION()){
            i++
        }else{
            j++
        }
    }

    while(i < intArray1.size){
        DO_LOGIC()

        i++
    }

    while(j < intArray2.size){
        DO_LOGIC()

        j++
    }

    return result
}