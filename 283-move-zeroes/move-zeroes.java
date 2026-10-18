class Solution {
    public void moveZeroes(int[] nums) {
        int   n=nums.length;

    int i=0;
    for(int j=0;j<n;j++)
    {
        if(nums[j]!=0)
        {
            nums[i]= nums[j];
            i++;
        }
    }
    for(int j=i;j<n;j++)
    {
        nums[j]=0;
    }
        // int[] temp = new int[n];

        // // Pointer for temp
        // int index = 0;

        // // Traverse input array
        // for (int i = 0; i < n ;i++) {
        //     // If non-zero, copy to temp
        //     if (nums[i] != 0) {
        //         temp[index] = nums[i];
        //         index++;
        //     }
        // }

        // // Copy temp back to original
        // for (int i = 0; i < n; i++) {
        //     nums[i] = temp[i];
        // }
    //     int i=0,j=0;
    //    while(i<n)
    //    {
    //       if(nums[i]!=0)
    //       {
    //         nums[j]=nums[i];
    //         j++;
    //       }     
    //         i++;
    //      }

    //      while(j<n)
    //      nums[j++]=0;
       }
    
    }
