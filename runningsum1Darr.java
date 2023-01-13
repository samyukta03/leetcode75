/*
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
* Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 */
public class runningsum1Darr {
    class Solution {
        public int[] runningSum(int[] nums) {
            int n = nums.length;
            int[] arr = new int[n];
            arr[0]=nums[0];
            for(int i=1;i<n;i++){
                arr[i]=arr[i-1]+nums[i];
            }
            return arr;
        }
    }
}
