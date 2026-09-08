class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;

        int low=0,high=n-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[mid] == target) 
            return mid;

 // check for left sprted
            if(nums[low]<=nums[mid])
            {
                if(nums[low]<=target && target <=nums[mid])  // 4<=3 
                {
                    high=mid-1;
                }
                else
                    low=mid+1;    // run
            }

//check for right sorted
            else{
                if(nums[mid]<= target && target <= nums[high])  // 2<=3 run 
                {
                    low=mid+1;
                }
                else
                   high=mid-1;  
            }

        }
  return -1;

    }
}