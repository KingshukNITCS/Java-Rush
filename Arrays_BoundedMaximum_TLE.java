// https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/description/
class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int len = nums.length;
        int nsub = 0;        
        for(int i=0; i<len; i++)
        {            
            for(int j=i; j<len; j++)             
            {
                //subarr = i to j
                int check = 0;
                int max = -1;
                for(int k=i; k<=j; k++)
                {
                    if(nums[k]>max) max=nums[k];                                                                                
                    //System.out.print(nums[k]+" ");                    
                }
                if(max<left || max>right) check++;
                if(check==0) nsub++;
                //System.out.println();
            }
        }
        return nsub;
    }
}
