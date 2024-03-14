// https://leetcode.com/problems/max-chunks-to-make-sorted/description/

class Solution {
    public int maxChunksToSorted(int[] arr) {
        int chunks = 0;
        int len = arr.length;
        int max = -1;
        //if max num till that index = index then it can be one chunk
        for(int i=0; i<len; i++)
        {
            if(arr[i]>max) max=arr[i];
            if(i==max) chunks++;
        }
        return chunks;
    }
}
