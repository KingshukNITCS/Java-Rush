//Boyer Moore Voting Algo
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int el=0; int freq=0;
        el=nums[0]; 
        freq++;
        for(int i=1; i<n; i++)
        {
            if(nums[i]==el) freq++;
            else
            {
                if(freq>0) freq--;
                else
                {
                    el=nums[i]; freq++;
                }
            }
        }
        return el;
    }
}
