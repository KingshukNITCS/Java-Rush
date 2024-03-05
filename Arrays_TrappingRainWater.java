// https://leetcode.com/problems/trapping-rain-water/description/
class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int len = height.length;
        int[] pmax = new int[len];
        int[] smax = new int[len];
        pmax[0] = height[0];
        smax[len-1] = height[len-1];
        for(int i=1; i<len; i++)
        {
            if(pmax[i-1]<height[i])
            {
                pmax[i]=height[i]; 
            }
            else
            {
                pmax[i]=pmax[i-1];
            }
            if(smax[len-i]<height[len-i-1])
            {
                smax[len-i-1]=height[len-i-1];
            }
            else
            {
                smax[len-i-1]=smax[len-i];
            }
        }
        for(int j=1; j<len-1; j++)
        {
            int amount = Math.min(pmax[j-1],smax[j+1])-height[j];
            if(amount>0) 
            {
                ans=ans+amount;
            }
        }
        return ans;
    }
 }
