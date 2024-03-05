// https://leetcode.com/problems/product-of-array-except-self/description/


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] parr = new int[len];
        parr[0] = nums[0];
        for(int i=1; i<len; i++)
        {
            parr[i]=parr[i-1]*nums[i];
        } 
        int suff = 1;
        for(int j=len-1;j>=1;j--)
        { 
            parr[j]=parr[j-1]*suff;
            suff=suff*nums[j];
        }
        parr[0]=suff;
        return parr;
    }
  }
