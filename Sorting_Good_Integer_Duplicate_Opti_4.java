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
        Arrays.sort(arr);
        int i=0, lesscount=0, gn=0;
        while(i<n)
        {            
            if(i>0)
            {
            if(arr[i]!=arr[i-1]) lesscount=i;
            }
            if(arr[i]==lesscount) gn++;             
            i++;
        }
       System.out.println(gn);     
    }
}
