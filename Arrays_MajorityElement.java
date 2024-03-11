//https://leetcode.com/problems/majority-element/description/

class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int times = len/2;
        int ans=0;
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        for(int i=0; i<len; i++)
        {
            if(hmap.containsKey(nums[i]))
            {
                hmap.put(nums[i],(hmap.get(nums[i])+1));
            }
            else
            {
                hmap.put(nums[i],1);
            }
        }
        for(int x : hmap.keySet())
        {
            if(hmap.get(x)>times)
            {
                ans = x; break;
            }
        } 
        return ans;
    }
  }
