class Solution {
    public String longestCommonPrefix(String[] strs) {
     if(strs == null || strs.length==0)
     return "";

     String strPref = strs[0];
     int strLength = strPref.length();

     for(int i=1;i<strs.length;i++)
     {
        String secondStr = strs[i];
        while(strLength > secondStr.length() || !strPref.equals(secondStr.substring(0,strLength)) )  {
        strLength--;
        if(strLength == 0)
            return "";

        strPref = strPref.substring(0,strLength);
        }
     }
     return strPref;   
    }
}