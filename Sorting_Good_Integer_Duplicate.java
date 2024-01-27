/*

Given N array Integers, Calculate number of good integers. An element is said to be good integers, if {No. of element < element == element itself}

Note: Array elements can be duplicate.
Input Format

Integer representing N representing length of array
N numbers of Array
Constraints

1<= N <= 10 ^ 6
1<= A[i] <=10 ^ 9
Output Format

Count of Good Integers
Sample Input 0

6
2 3 3 8 2 0
Sample Output 0

3


*/

import java.io.*;

import java.util.*;

public class Solution {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++)

        {

            arr[i] = sc.nextInt();

        }
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(hm.containsKey(arr[i]))
            {
                int temp = 1+hm.get(arr[i]);
                hm.put(arr[i],temp);
            }
            else hm.put(arr[i],1);
        }       
              

        Arrays.sort(arr);

        int i=0, gn=0;

        while(i<n)

        {

            if(arr[i]==i) 
            {
                if(i==0)
                {
                int freq = hm.get(arr[i]);
                gn=gn+freq;
                }
                if(i>0)

                {
                if(arr[i]!=arr[i-1])
                {

                int freq = hm.get(arr[i]);

                gn=gn+freq;

                }

                }
            }

            

            i++;

        }

       System.out.println(gn);

     

    }
}
