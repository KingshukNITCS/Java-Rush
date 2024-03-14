//https://leetcode.com/problems/next-greater-element-iii/description/

class Solution {
    public int nextGreaterElement(int n) {
        char[] arr = (n + "").toCharArray();
        int len = arr.length;
        
        int idx = 0; int count=0;
        for(int i=len-2; i>=0; i--)
        {
            if(arr[i]<arr[i+1])
            {
                count++;
                idx=i;
                break;
            }
        }
        
        if(count==0) return -1;
        
        int swapidx=idx+1;
        for(int i=idx+1; i<len; i++)
        {
            if(arr[i]>arr[idx] && arr[i]<arr[swapidx]) swapidx=i;
        }
        
        char temp=arr[idx];
        arr[idx]=arr[swapidx];
        arr[swapidx]=temp;
        Arrays.sort(arr,idx+1,len);
        long ans = Long.parseLong(new String(arr));
        if(ans>Integer.MAX_VALUE) return -1;
        else return (int)ans;
        /*for(int i=0; i<len; i++)
        {
            System.out.println(arr[i]);
        }
        return idx;*/
    }
}
/* 
123542 
*/
  
