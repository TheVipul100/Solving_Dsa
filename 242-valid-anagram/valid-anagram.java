class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c=s.toCharArray();
        char[] d=t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);

        String s1=new String(c);
        String s2=new String(d);
        if(s1.equals(s2))
        return true;

        return false;
    }
}