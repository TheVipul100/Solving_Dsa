class Solution {
    public int reverse(int x) {
       int rever = 0;
       while(x!=0)
       {
        int digit = x % 10;   
        x = x /10;
        if (rever > Integer.MAX_VALUE / 10 ||
               (rever == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (rever < Integer.MIN_VALUE / 10 ||
               (rever == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
       }
       
        rever  = rever * 10 + digit; 

    }
    return rever;
}
}