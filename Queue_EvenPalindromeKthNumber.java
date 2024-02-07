/* Given K, Print the Kth Palindrome Number in the increasing series of even digit numbers using digits 1 and 2 only.
Input Format

The only line contains number K
Constraints

1<= K <=20
Output Format

Return the kth number of the series
Sample Input 0

5
Sample Output 0

2112*/

import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt(); int count=1; int n=1;

        while(count<=k)

        {

            if(onetwo(n)) 

            {
                if(onetwopalin(n)) 

                count++;

            }

            n++;

        }

        System.out.println(n-1);
  
    }

    static boolean onetwo(int n)

    {

        String snum = String.valueOf(n);

        char[] cnum = snum.toCharArray();

        for(int i=0; i<cnum.length; i++)

        {

            if((cnum[i] == '1') || cnum[i] == '2') 

            {

                continue;

            }

            else return false;

        }
        return true;

    }

    static boolean onetwopalin(int n)

    {

        String snum = String.valueOf(n);

        char[] cnum = snum.toCharArray();
        int clen = cnum.length;
        if(clen%2!=0) return false;

        int start = 0; int end = clen-1;
       
        while(start<=end)

        {

            if(cnum[start]!=cnum[end])
            {

                return false;             

            }

            start++; 

            end--;                    
            
        }

        return true;

    }

} 
