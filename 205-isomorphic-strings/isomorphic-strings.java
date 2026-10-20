class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) 
        return false;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                boolean sameInS = s.charAt(i) == s.charAt(j);
                boolean sameInT = t.charAt(i) == t.charAt(j);
                if (sameInS != sameInT) 
                return false;  
            }
        }
        return true;
    }
}