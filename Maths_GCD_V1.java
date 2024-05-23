//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int a;
            a = Integer.parseInt(br.readLine());
            
            
            int b;
            b = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.gcd(a, b);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int gcd(int a, int b) {
        if(a>b)
        {
            int temp=a;
            a=b; b=temp;
        }
        int modu = b%a;
        System.out.println(modu);
        if(modu==0) return a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(b%a);
        gcd(b%a,a);
        return -1;
    }
}

