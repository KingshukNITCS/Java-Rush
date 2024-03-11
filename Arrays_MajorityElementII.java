// https://leetcode.com/problems/majority-element-ii/description/

class Solution {
    public List<Integer> majorityElement(int[] nums) {            
        int len = nums.length;
        int times = len/3;
        ArrayList<Integer> ans = new ArrayList<>();
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
                ans.add(x);
            }
        } 
        return ans;
    }
}
