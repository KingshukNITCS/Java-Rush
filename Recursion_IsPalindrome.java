import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String stro = scn.nextLine();
        String str = stro.toLowerCase();
        int slen = str.length();
        System.out.println(pal(str,0,slen-1));
        }
    public static boolean pal(String str, int x, int y)
    {
        //if(x>=y) return true;
        if(!(x<y)) return true;
        if(pal(str,x+1,y-1) && str.charAt(x)==str.charAt(y)) return true;
        else return false;
    }
    
}
