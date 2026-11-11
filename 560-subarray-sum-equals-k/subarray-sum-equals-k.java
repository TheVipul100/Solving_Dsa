class Solution {
    public int subarraySum(int[] nums, int k) {
        // int n = nums.length, count = 0;

        // // starting index
        // for (int startIndex = 0; startIndex < n; startIndex++) {
        //     // ending index
        //     int currentSum = 0;

        //         /* add all the elements of subarray*/
        //     for (int endIndex = startIndex; endIndex < n; endIndex++) {
        //             currentSum += nums[endIndex];

        //         if (currentSum == k) 
        //         count++;
                
        //     }
        // }
        // return count;

        Map<Integer, Integer> prefixSumCount = new HashMap<>();
     
     // sum=0 with freq. as 1
        prefixSumCount.put(0, 1);
        
        int count = 0;
        int currentSum = 0;
        
        for (int num : nums) {
            currentSum += num;
            
            count += prefixSumCount.getOrDefault(currentSum - k, 0);
            
            prefixSumCount.merge(currentSum, 1, Integer::sum);
        }
        
        return count;
    }
}