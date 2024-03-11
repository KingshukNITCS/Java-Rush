// https://leetcode.com/problems/first-missing-positive/description/
class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        int max = len+1; //max possible 
        for(int i=0; i<len; i++)
        {
            if(nums[i]==i+1)
            {
                continue;
            }
            else if(nums[i]<=0 || nums[i]>=len+1)
            {
                continue;
            }
            else
            {
                int temp=nums[i];
                if(nums[temp-1]==nums[i]) continue; //don't swap if both nums are same
                //swap nums[temp-1] & nums[i]
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
                i--;
            }
        }
        for(int i=0; i<len; i++)
        {
            if(nums[i]==(i+1)) continue;
            else return i+1;
        } 
        return max;
    }
 }
