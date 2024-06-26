// https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1

class Solution {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    static long inversionCount(long arr[], int n) {
        int invcount = 0;
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n-1; j++)
            {
                if(arr[i]>arr[j+1])
                {
                    invcount++;
                    //System.out.println(arr[i] + "," + arr[j+1]);
                }
            }
        }
        return invcount;
    }
}
