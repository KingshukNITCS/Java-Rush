/* https://leetcode.com/problems/valid-parentheses/*/
class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> hm = new HashMap<>();
        hm.put(')','(');hm.put('}','{');hm.put(']','[');
        Stack<Character> st = new Stack<>(); 
        st.push('a'); //Dummy char to prevent null stack exception
        int slen = s.length();
        if(slen==1) return false;
        for(int i=0; i<slen; i++)
        {
            
            char c = s.charAt(i);
            //System.out.println(c);
            if(hm.containsValue(c)) st.push(c);
            else if (hm.containsKey(c))
            {
                //System.out.println(st.peek());
                if(st.peek()==hm.get(c))
                {
                    //System.out.println(c);
                    st.pop();
                }
                else return false;
            }
        }
        //System.out.print(st.size());
        if(st.size()==1) return true;
        else return false;
    }
}
