First Try to do it by yoursel with this hint:
Sort A,
make the pair with the min + max,
and continue do this.

Solution:
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n/2;i++){
            ans=Math.max(ans,nums[i]+nums[n-1-i]);
        }
        return ans;
    }
}