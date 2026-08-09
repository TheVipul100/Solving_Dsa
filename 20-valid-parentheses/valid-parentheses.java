class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
            
        for(char str : s.toCharArray()){
         if(str =='(' || str =='{' || str =='[')
         st.push(str);  

        else {
            if(st.isEmpty())
            return false;

        char ch=st.pop();

        if((str==')' && ch == '(') || (str== '}' && ch =='{') || (str==']' && ch=='[' ))
             continue;
         else
             return false;
        } 
    }
    return st.isEmpty();
  }
}