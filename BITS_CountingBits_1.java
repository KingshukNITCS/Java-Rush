//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            Solution ob = new Solution();
            int cnt = ob.setBits(N);
            System.out.println(cnt);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static int setBits(int N) {
        int count=0;
        for(int i=0; i<32; i++)
        {
            if(checkBit(N,i)==true) count++;  
        }
        return count;
    }
    static boolean checkBit(int N, int i)
    {
        if((N & (1<<i))==0)
        {
            return false;
        }
        else return true;
    }
}
