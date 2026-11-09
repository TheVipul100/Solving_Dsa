class Solution {
    public int missingNumber(int[] nums) {
      int n=nums.length;

     int xor=nums.length;
     for(int i =0;i<n;i++)
     {
        xor=xor^nums[i]^i;
     }

    return xor;

    }
}
//      int sum = n*(n+1)/2;
//      int missing=0;

//         for(int i=0;i<n;i++)  //optimal approach
//         {
//             missing+=nums[i];
//         }

//         return sum-missing;
//     }
// }





    //  for(int i=1;i<=n;i++)  //1
    //  {
    //     int flag=0;
    //     for(int j=0;j<n;j++)
    //     {
    //         if(nums[j] == i)
    //         {
    //             flag=1;
    //             break;
    //         }
    //     }
    //     if(flag == 0)
    //     return i;
    // }
    //return 0;
    // }
// }