import java.io.*;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

       

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        

        //if(k==1) System.out.print("1");

        //else if(k==2) System.out.print("2");

        System.out.println(onetwo(k));

        

            

            

        

            

        

    }

    static String onetwo(int k)

    {

        Queue<String> sq = new LinkedList<>();

        

        

        sq.add("1"); sq.add("2");

        int count = 0; 

        

        while(count<=k)

        {

            String rem = sq.remove();

            String new_1 = rem + "1";
            
            
            
            //if(palin(new_1))
            

            sq.add(new_1);

            if(palin(new_1) && (new_1.length())%2==0) 
            {
                count++;
                //System.out.println(new_1);
            }
            
            

            if(count==k) break;

            String new_2 = rem + "2";
            
            
            
            
            

            sq.add(new_2);

            if(palin(new_2) && (new_2.length())%2==0) 
            {
                count++;
                //System.out.println(new_2);
            
            }
            

            if(count==k) break;
           

        }

        int len = sq.size();

        for(int i=1; i<len; i++)

        { 

            sq.remove();

        }

        return(sq.remove());

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
