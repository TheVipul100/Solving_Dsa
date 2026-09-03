class Solution {

    public int binSearch(int[] nums,int low, int high , int target)
    {
        if(low>high)
        return -1;

        int mid = low + (high-low)/2;  
        
        if(nums[mid] == target)
        return mid;
        else if(nums[mid]<target)
        return binSearch(nums,mid+1,high,target);
        
        return binSearch(nums,low,mid-1,target);
    }

    public int search(int[] nums,int target) {
        int n=nums.length;
        int low = 0 , high = n-1;
        return binSearch(nums,low,high,target);
        }
}