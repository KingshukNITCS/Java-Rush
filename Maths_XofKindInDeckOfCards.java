// https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/description/

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
        int[] varr = new int[hmsize];
        int x=0;
        for(int val : hm.values())
        {
            varr[x++]=val;
        }
        if(gcdarr(varr)>1) return true;
        else return false;
    }
    int gcdarr(int[] arr)
    {
        int n = arr.length;
        int gcd = 0;
        for(int i=0; i<n; i++)
        {
            gcd = gcdpair(gcd,arr[i]);
        }
        return gcd;
    }
    int gcdpair(int x, int y)
    {
        if(x==0) return y;
        return(gcdpair(y%x,x));
    }
}
