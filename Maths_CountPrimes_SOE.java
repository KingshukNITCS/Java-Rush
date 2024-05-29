// Sieve of Eratosthenes j = i*i more efficient than j = i+1
/*
This loop matters

for(int j=i*i;j<n;j+=i) arr[j]=false;

no need to again check multiple, for each number till n. just iterate multiple       
of i (the current prime number)                  
*/
class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        boolean[] arr = new boolean[n];
        arr[0]=false; arr[1]=false;
        int count=0;        
        for(int i=2; i<n; i++)
        {
            arr[i]=true;
        }
        for(int i=2; (i*i)<n; i++)
        {
            if(arr[i]==true)
            {
                
                for(int j=i*i;j<n;j+=i)
                {
                    arr[j]=false;
                }
            }
        }
        for(boolean i : arr)
        {
            if(i==true)
            {                
                count++;
            }
        }
        return count;
    }
}
