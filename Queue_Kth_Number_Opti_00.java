import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        
        if(k==1) System.out.print("1");
        else if(k==2) System.out.print("2");
        else System.out.println(onetwo(k));
                                                          
    }
    static String onetwo(int k)
    {
        Queue<String> sq = new LinkedList<>();                

        sq.add("1"); sq.add("2");

        int count = 2;

        
        while(count<=k)

        {

            String rem = sq.remove();

            String new_1 = rem + "1";

            sq.add(new_1);

            count++;

            if(count==k) break;

            String new_2 = rem + "2";

            sq.add(new_2);

            count++;

            if(count==k) break;

        }

        int len = sq.size();

        for(int i=1; i<len; i++)

        { 

            sq.remove();

        }

        return(sq.remove());
    }
}
