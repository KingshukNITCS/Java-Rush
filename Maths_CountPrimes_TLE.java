// https://leetcode.com/problems/count-primes/description/

class Solution {
    public int countPrimes(int n) {
        if(n<=1) return 0;
        int[] arr = new int[n-2];
        int count=0;
        for(int i=0; i<n-2; i++)
        {
            arr[i]=i+2;
        }
        for(int i=0; ((i+2)*(i+2))<=n; i++)
        {
            if(arr[i]>0)
            {
                int temp=arr[i];
                for(int j=i+1; j<n-2; j++)
                {
                    if(arr[j]>0 && arr[j]%temp==0)
                    {
                        arr[j]=0-arr[j];
                        System.out.println(arr[j]);
                    }
                    
                }
            }
        }
        for(int i : arr)
        {
            if(i>0)
            {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
    boolean isprime(int x)
    {
        int count=0;
        for(int i=1; i*i<=x; i++)
        {
            if(x%i==0) count++;
        }
        if(count==1) return true;
        else return false;
    }
}
