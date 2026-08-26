class Solution {
    public String removeKdigits(String num, int k) {
        List<Character> use = new ArrayList<>();
        for(int i=0;i<num.length();i++)
        {
            char digit = num.charAt(i); 

            while(!use.isEmpty() && k>0 && use.get(use.size()-1) > digit){
                use.remove(use.size()-1);
                k--;
            }
            use.add(digit);
        }

        while (k > 0 && !use.isEmpty()) {
        use.remove(use.size() - 1);    // for 123456 case
        k--;
        }
        
        if (use.isEmpty())
        return "0";

        StringBuilder result= new StringBuilder();
        for (char c : use) {
        result.append(c);
        }
        
        int start = 0;
        while (start < result.length() - 1 && result.charAt(start) == '0') {
        start++;
    }
        result.delete(0, start);

        if (result.length() == 0)
        return "0";

    return result.toString();
    }
}