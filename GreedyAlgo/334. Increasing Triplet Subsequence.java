334. Increasing Triplet Subsequence
Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false. 
Example 2:

Input: nums = [5,4,3,2,1]
Output: false
Explanation: No triplet exists.

Example 3:

Input: nums = [2,1,5,0,4,6]
Output: true
Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.

Solution:
Hint:
first find the smallest ,then second smallest and the remaining one is  k. if(i<j<k) then return true,otherwise false;

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i=Integer.MAX_VALUE;
        int j=Integer.MAX_VALUE;
        for(int k:nums){
            if(k<=i){
                i=k;
            }
            else if(k<=j){
                j=k;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}