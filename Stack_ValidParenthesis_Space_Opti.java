class Solution {
    public boolean isValid(String s) {


        Stack<Character> st = new Stack<>(); 
        st.push('a'); //Dummy char to prevent null stack exception
        int slen = s.length();
        if(slen==1) return false;
        for(int i=0; i<slen; i++)
        {
            
            char c = s.charAt(i);

            if(c=='('||c=='{'||c=='[')
            {
                st.push(c);
            }
            else if(c==')'||c=='}'||c==']')
            {

                if(st.peek()=='(' && c==')')
                {

                    st.pop();
                }
                else if(st.peek()=='{' && c=='}')
                {
                    st.pop();
                }
                else if(st.peek()=='[' && c==']')

                {

                    st.pop();

                }
                else return false;
            }
        }

        if(st.size()==1) return true;
        else return false;
    }
}
