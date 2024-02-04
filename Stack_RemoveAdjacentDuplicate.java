/* Given a string S, Remove equal pair of adjacent character and return the final String
Input Format

A single line containing the string
Constraints

1 <= S.length() <= 10^5
Output Format

Print the String after removing all the adjacent same characters
Sample Input 0

abbbbd
Sample Output 0

ad*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int slen = str.length();
        System.out.print(rdup(str.toLowerCase(),slen));
       
    }
    public static String rdup(String str, int slen)
    {
        if(slen==1) return str;
        Stack<Character> st = new Stack<>();

        st.push(str.charAt(slen-1));

        for(int i=slen-2;i>=0;i--)

        {

            char c = str.charAt(i);

            if(st.peek()==c) st.pop();

            else st.push(c);

        }

        StringBuilder sb = new StringBuilder();

        int stlen = st.size();
        if(stlen==0) return null;

        for(int i=0;i<stlen;i++)

        {

            sb.append(st.pop());

        }

        return(sb.toString());
    }
            }
