// https://leetcode.com/problems/single-number-ii/description/

class Solution {
    public int singleNumber(int[] nums) {
        int snum=0;
        for(int i=0; i<32; i++)
        {
            int count=0;
            for(int n : nums)
            {
                if(checkBit(n,i)==true) count++;
            }
            if(count%3==0) snum+=0;
            //else snum+=1*((int)Math.pow(2,i)); //doesn't work for some cases like -ve no
            else snum+=1*(1<<i);
        }
        return snum;
    }
    boolean checkBit(int n, int i)
    {
        if((n & 1<<i)==0) return false;
        else return true;
    }
}
