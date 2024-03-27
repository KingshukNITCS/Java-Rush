// https://leetcode.com/problems/single-number-iii/description/

// Get XOR of all. At end 2 no xor will remain. 1st bit index lsb in xor where 1, there the 2 no bit value will differ. Divide the full num array into two lists based on the value of that lsb bit - 0 or 1. Xor those lists seperately and get the 2 req no

class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = nums[0];
        int len = nums.length;
        for(int i=1; i<len; i++)
        {
            xor = xor ^ nums[i];
        }
        int w=0;
        while(w<32)
        {
            if(checkBit(xor,w)==true) break;
            w++;
        }
        ArrayList<Integer> al0 = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>();
        for(int n : nums)
        {
            if(checkBit(n,w)==false) al0.add(n);
            else al1.add(n);
        }
        int[] arr = new int[2];
        int xor0=al0.get(0);
        int xor1=al1.get(0);
        for(int i=1; i<al0.size(); i++)
        {
            xor0=xor0^al0.get(i);
        }
        for(int i=1; i<al1.size(); i++)
        {

            xor1=xor1^al1.get(i);
        }
        arr[0]=xor0; arr[1]=xor1;
        return arr;
    }
    public boolean checkBit(int n, int i)
    {
        if((n & (1<<i))==0) return false;
        else return true;
    }
 }
