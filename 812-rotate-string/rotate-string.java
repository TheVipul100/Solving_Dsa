class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
        return false;
       StringBuilder str = new StringBuilder(s);
      for(int i=0;i<s.length();i++)
      {
        char first = str.charAt(0);
          str.deleteCharAt(0);
          str.append(first);
          if(goal.equals(str.toString()))
            return true;
      }
       
    return false;
    }
}