package com.pkj.wow.dsa.leetcode_blind75.array

/**
 * Input: nums = [2,3,-2,4]
 * Output: 6
 * Explanation: [2,3] has the largest product 6.
 *
 *  int maxProduct(vector<int>& nums) {
int maxp = INT_MIN;
int n = nums.size();
int prod = 1;
for(int i=0;i<n;i++){
prod*= nums[i];
maxp = max(maxp,prod);
if(prod == 0)   prod = 1;
}
prod = 1;
for(int i=n-1;i>=0;i--){
prod*= nums[i];
maxp = max(maxp,prod);
if(prod == 0)   prod = 1;
}
return maxp;
}
 */

fun maxProductSubArray(nums: IntArray): Int{
    var result = 1
    var max = 1
    var min = 1

    for(i in nums.indices){
        if(nums[i] == 0){
            max = 1
            min = 1
            continue
        }
        val tempMax = max * nums[i]
        max = maxOf(tempMax, min, nums[i])
        min = minOf(tempMax, min, nums[i])
        result = Math.max(result, max)
    }

    return result
}

fun main(){
    println(maxProductSubArray(intArrayOf(2,3,-2,4)))
    println(maxProductSubArray(intArrayOf(-2,0,-1)))
}
