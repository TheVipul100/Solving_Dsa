class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length ; //, start=0, end=n-1;
        int temp[] = new int[n];
       for(int i=0;i<n;i++)
       {
          temp[(i+k)%n]=nums[i];
       }
         
         for(int i=0;i<n;i++){
            nums[i]=temp[i];
         }
         


    //    reverse(nums,0,n-1);
    //    reverse(nums,0,k-1);
    //    reverse(nums,k,n-1);
    // }
    
    // public static void reverse(int[] nums,int start,int end){
    //    while(start<end)
    //    {
    //    int temp= nums[start];
    //    nums[start]=nums[end];
    //    nums[end] = temp;
    //    start++;
    //    end--;
    //    }
    }
}