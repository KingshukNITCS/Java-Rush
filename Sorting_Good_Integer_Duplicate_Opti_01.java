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
                int freq = hm.get(arr[i]);
                if(i>0 && arr[i]==arr[i-1]) gn=gn;
                else gn=gn+freq;
            }
            i++;

        }

       System.out.println(gn);
    }

}
