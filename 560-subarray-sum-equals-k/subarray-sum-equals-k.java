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



        Map<Integer, Integer> forseen = new HashMap<>();
     
          int count =0 , n =nums.length;
        int prefixSum=0;
        
        for(int i=0;i<n;i++)
        {
            prefixSum+=nums[i];

            if(prefixSum == k)
               count++;

           if (forseen.containsKey(prefixSum - k))
    {
        count += forseen.get(prefixSum - k);
    }

    // changed: store frequency instead of index
    forseen.put(prefixSum, forseen.getOrDefault(prefixSum, 0) + 1);
}
        return count;
    //  // sum=0 with freq. as 1
    //     prefixSumCount.put(0, 1);
        
    //     int count = 0;
    //     int currentSum = 0;
        
    //     for (int num : nums) {
    //         currentSum += num;
            
    //         count += prefixSumCount.getOrDefault(currentSum - k, 0);
            
    //         prefixSumCount.merge(currentSum, 1, Integer::sum);
    //     }
        
    //     return count;
    }
}