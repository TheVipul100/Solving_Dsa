class Solution {
    public int findMin(int[] arr) {
        int n=arr.length;

        int left= 0,right=n-1;
        int min=Integer.MAX_VALUE;

        while(left<=right)
        {
            int mid= (left+right)/2;
            if(arr[left]<=arr[right])
           {
            min=Math.min(min,arr[left]);
            break;
           }


            if(arr[left]<=arr[mid])
            {
               min=Math.min(min,arr[left]);
               left = mid+1;
            }
            else
            {
               min=Math.min(min,arr[mid]);
               right = mid-1;
            }
        }

         return min;
    }
}