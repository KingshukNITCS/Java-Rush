//https://leetcode.com/problems/majority-element-ii/description/
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int el1=0; int el2=0;
        int f1=0; int f2=0;
        for(int i=0; i<n; i++)
        {
            if(nums[i]==el1) f1++;
            else if(nums[i]==el2) f2++;
            else
            {
                if(f1==0)
                {
                    el1=nums[i];
                    f1++;
                }
                else if(f2==0)
                {
                    el2=nums[i];
                    f2++;
                }
                else
                {
                    f1--;f2--;
                }
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        //verify the count of the remaining 2 els and add to list
        int count1=0; int count2=0;
        for(int i=0; i<n; i++)
        {
            if(nums[i]==el1) count1++;
            else if(nums[i]==el2) count2++;
        }
        if(count1>(n/3)) al.add(el1);
        if(count2>(n/3)) al.add(el2);
        return al;
    }
}
