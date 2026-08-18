class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int totalWater = 0;
        int left=0, right=n-1;  
        int leftMax=0,rightMax=0;

        if(n==0) return 0;

        while(left<right)
        {
          if(height[left]<=height[right])
          {
            leftMax=Math.max(height[left],leftMax);
            totalWater += leftMax - height[left];
            left++;
          }
          else{
            rightMax=Math.max(height[right], rightMax);
            totalWater += rightMax - height[right];
            right--;
          }
        }
         return totalWater;
    }
}