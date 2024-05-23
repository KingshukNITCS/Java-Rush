class Solution {
    public static int gcd(int a, int b) {
        if(a>b)
        {
            int temp=a;
            a=b; b=temp;
        }
        if(a==0) return b;
        return gcd(b%a,a);
    }
}
