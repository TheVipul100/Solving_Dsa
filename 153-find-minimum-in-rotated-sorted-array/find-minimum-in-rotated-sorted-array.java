class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0,high=n-1;
        int min=5000;
        while(low<=high)
        { 
            int mid=(low+high)/2;
                //when the search space is sorted in case[4,5,6,0,1,2] so 0 to 2 the array is sorted directly then take low as your minimum in that case 

                if(nums[low] <= nums[high])
                {
                    min=Math.min(min,nums[low]);
                    break; // no need to perform further binary search on [0,1,2] directly 0 is the ans;
                }


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