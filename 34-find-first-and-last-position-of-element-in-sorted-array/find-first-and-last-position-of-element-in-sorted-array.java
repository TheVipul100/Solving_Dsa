class Solution {
    public int[] searchRange(int[] nums, int target) {
        int m=nums.length;
        int start = 0, end = m-1;
        int[] ans = {-1,-1};

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                ans[0] = mid;
                end = mid - 1;
            }
            else if(nums[mid]>target){
                   end = mid-1;
            }
            else
                start = mid + 1;
        }
        
        //

        start = 0;
        end = m - 1;

       
        while (start <= end) {

            int mid = start + (end - start) / 2;
            // end position
            if (target == nums[mid]) {
                ans[1] = mid;
                start = mid + 1;
            }
            else if(nums[mid]>target) {
                  end = mid - 1;
            }
            else
            {
               start = mid + 1;
            }
        }
        return ans;
    }
}

    //    for(int i=0;i<m;i++)
    //     {
    //         if(nums[i]==target)
    //         {
    //            if(start == -1)
    //            start = i;
             
    //            end = i;
    //         }
    //     }
    //     return new int[]{start,end};