import java.io.*;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++)

        {

            arr[i] = scn.nextInt();

        }

        int k = scn.nextInt();

        int start = 0, end = n-1; int count=0;
        int ans = Integer.MIN_VALUE;

        while(start<=end)

        {

            int mid = (start+end)/2;

            if(arr[mid]==k)

            {

                ans = arr[mid]; break;

            }

            if(arr[mid]>k)

            {

                end = mid-1;

            }

            if(arr[mid]<k)
            {

                if(arr[mid]>ans) ans=arr[mid];
                start = mid+1;

            }

        }
          
        System.out.println(ans);

    }

 }
