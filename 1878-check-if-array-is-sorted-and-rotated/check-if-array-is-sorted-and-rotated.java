class Solution {
    public boolean check(int[] nums) {
    int n=nums.length;
       int i = 1;

       if(n == 1)
       return true;
       
       while(i<n && nums[i] >= nums[i-1])
       {
        i++ ;
       }

       if(i==n)
       return true;

       if(nums[i]>nums[0])
       return false;

      i++;
      
       while(i<n && nums[i]>=nums[i-1] && nums[i]<=nums[0])
       {
        i++;
       }
          
          return i==n;

    }
}