// 53. Maximum Subarray
// Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

// A subarray is a contiguous part of an array.

 

// Example 1:

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: [4,-1,2,1] has the largest sum = 6.

// using kadane's algorithm
// it works on , each index is the endpoint of sub array

class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSum = Integer.MIN_VALUE;
        
        int curr_sum = 0;
        
        for(int i=0;i<nums.length;i++) {
            curr_sum = Math.max(curr_sum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, curr_sum);
        }
        return maxSum;
    }
}