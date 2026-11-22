class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int start=0,end=n-1;

        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid] == target)
            return true;

            if(nums[start] == nums[mid] && nums[mid] == nums[end])
            {
                start++;
                end--;
                continue;// till u dont get the search space u will keep shrinking the array
            }  // flow will go above now wont go down -- used continue and first check shrink and then move down

            //identify the sorted half
            // left sort
            if(nums[start]<=nums[mid])
            {
                if(nums[start]<=target && target <= nums[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            //search in right sorted part if left is not sorted
            else // nums[mid]<=nums[end]
            {
                if(nums[mid]<=target && target<=nums[end])
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }   
        }
        return false;
    }
}