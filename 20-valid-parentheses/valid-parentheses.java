class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        char[] ch1= s.toCharArray();
        for( int i=0;i<ch1.length;i++){
         if(ch1[i] =='(' || ch1[i] =='{' || ch1[i] =='[')
         st.push(ch1[i]);  

        else {
            if(st.isEmpty())
            return false;

        char ch=st.pop();

        if((ch1[i] ==')' && ch == '(') || (ch1[i] == '}' && ch =='{') || (ch1[i] ==']' && ch=='[' ))
             continue;
         else
             return false;
        } 
    }
    return st.isEmpty();
  }
}