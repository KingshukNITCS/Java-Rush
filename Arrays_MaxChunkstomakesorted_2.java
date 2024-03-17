// https://leetcode.com/problems/max-chunks-to-make-sorted-ii/description/
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int len = arr.length;
        int pfmax[] = new int[len];
        int sfmin[] = new int[len];
        pfmax[0]=arr[0];
        sfmin[len-1]=arr[len-1];
        for(int i=1; i<len; i++)
        {
            if(arr[i]>pfmax[i-1])
            {
                pfmax[i]=arr[i];
            }
            else
            {
                pfmax[i]=pfmax[i-1];
            }
        }
        for(int i=len-2;i>=0;i--)
        {
            if(arr[i]<sfmin[i+1])
            {
                sfmin[i]=arr[i];
            }
            else sfmin[i]=sfmin[i+1];
        }        
        int chunk=0; 
        // Iterate till second last index & for last index there will be a chunk
        for(int i=0; i<len-1; i++)
        {
            if(pfmax[i]<=sfmin[i+1]) chunk++;
        }        
        if(chunk==0) return 1;
        return ++chunk;
    }
}

/*
2,1,3,4,4
12344
01234
*/
