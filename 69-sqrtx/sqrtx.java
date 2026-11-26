class Solution {
    public int mySqrt(int x) {

        int ans = 0,low = 0,high = x;
 
        while (low <= high) {
            int mid = low + (high - low) / 2;

            long square = 1L * mid * mid;
            if (square <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
 
        return ans;
    }
    //     int i = 1;

    //     while ((long) i * i <= x) {
    //         i++;
    //     }
 
    //     return i - 1;
    // }
}
