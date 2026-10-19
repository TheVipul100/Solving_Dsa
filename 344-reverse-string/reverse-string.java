class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int len = s.length;
        for(int j=len-1;j>=len/2;j--)
        {
            char temp=s[i];
            s[i] = s[j];
            s[j]=temp;
            i++;
        }
        // for(char i: s)
        // char s 
        // s.reverse(s.charAt(i));



    }
}