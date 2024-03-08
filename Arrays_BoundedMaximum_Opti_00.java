// https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/description/
class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int len = nums.length;
        int ans = 0; 
        int lgei = 0; //last greater element index + 1
        int pvc = 0; //previous valid count 
        for(int ep=0; ep<len; ep++)
        {
            //subarrays considering the end point, three cases possible 
            if(nums[ep]>right)
            {
                ans=ans+0;
                lgei=ep+1;
                pvc=0;
            }
            else if(nums[ep]>=left && nums[ep]<=right)
            {
                ans=ans+(ep-lgei+1);
                pvc=ep-lgei+1;
            }
            else if(nums[ep]<left)
            {
                ans=ans+pvc;
            }
        }
        return ans;
    }
 }
