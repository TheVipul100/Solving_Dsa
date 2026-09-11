class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0,high=n-1;
        int min=5000;
        while(low<=high)
        { 
            int mid=(low+high)/2;
            // left sprted
            if(nums[low]<=nums[mid])
            {
                min=Math.min(min,nums[low]);  
                low=mid+1;
            }
 //right sorted
            else
            {
                min=Math.min(min,nums[mid]); 
                high=mid-1;
            }
        }
        return min;
    }
}