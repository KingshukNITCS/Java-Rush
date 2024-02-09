import java.io.*;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int k = scn.nextInt();

        Queue<String> sq = new LinkedList<>();

        sq.add("1"); sq.add("2");

        String ans =""; int count=1;

        while(count<=k)

        {

            String temp = sq.remove();

            if(palin(temp) && (temp.length())%2==0)

            { 

                ans = temp; 

                count++;

            }

            sq.add(temp+"1");

            sq.add(temp+"2");

        }

        System.out.print(ans);

    }

    static boolean palin(String str)

    {

        int len = str.length();

        int start = 0;

        int end = len-1;

        while(start<=end)

        {

            if(str.charAt(start)!=str.charAt(end)) return false;

            else

            {

                start++; end--;

            }

        }

        return true;

    }

          }
