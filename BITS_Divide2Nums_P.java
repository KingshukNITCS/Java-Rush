// https://leetcode.com/problems/divide-two-integers/description/

// Partially correct solution 

class Solution {
    public int divide(int dividend, int divisor) {
        long sign=1;
        long a = Math.abs(dividend);
        long b = Math.abs(divisor);
        if(dividend<0) sign*=-1;
        if(divisor<0) sign*=-1;
        long q=0; long temp=a;
        for(int i=31; i>=0; i--)
        {
            if((b<<i)<=temp)
            {
                System.out.println(i);
                q=q+(1<<i);
                temp=temp-(b<<i);
            }
        }
        long answer = sign*q;
        System.out.println(q);
        if(answer>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else if(answer<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)answer;
    }
}
