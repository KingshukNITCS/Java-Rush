class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int n = deck.length;
        for(int i=0; i<n; i++)
        {
            if(hm.containsKey(deck[i]))
            {
                int val = hm.get(deck[i]);
                hm.put(deck[i],val+1);
            }
            else
            {
                hm.put(deck[i],1);
            }
        }
        int hmsize = hm.size();
        int gcd = 0;
        for(int val : hm.values())
        {
            gcd = gcdpair(gcd,val);
        }
        if(gcd>1) return true;
        else return false;
    }
    
    int gcdpair(int x, int y)
    {
        if(x==0) return y;
        return(gcdpair(y%x,x));
    }
}
