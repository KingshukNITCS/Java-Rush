// https://leetcode.com/problems/single-number-ii/description/

class Solution {
    public int singleNumber(int[] nums) {
        int ans=nums[0];
        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(nums[0],1);
        for(int i=1; i<nums.length; i++)
        {
            int freq = 0;
            if(hmap.containsKey(nums[i]))
            freq = hmap.get(nums[i]);
            //don't include in ^ if already included twice
            if(freq>=2) continue;
            ans = (ans ^ nums[i]);
            hmap.put(nums[i],freq+1);
        }
        return ans;
    }
}
