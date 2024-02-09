import java.io.*;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int k = scn.nextInt();

        Queue<String> sq = new LinkedList<>();

        sq.add("11"); sq.add("22");

        String ans ="";

        for(int i=1; i<=k; i++)

        {

            String temp = sq.remove();

            if(i==k)

            { 

                ans = temp; break;

            }
            
            int len = temp.length();

            sq.add(temp.substring(0,len/2)+"11"+temp.substring(len/2,len));

            sq.add(temp.substring(0,len/2)+"22"+temp.substring(len/2,len));

        }

        System.out.print(ans);

    }
  }
