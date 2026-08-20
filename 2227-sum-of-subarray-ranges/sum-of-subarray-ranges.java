class Solution {
    public long subArrayRanges(int[] nums) {
           long answer=0;
        for(int i=0;i<nums.length;i++){
            int min=nums[i],max=nums[i];

            for(int j=i;j<nums.length;j++){
                if(nums[j]<min){
                 min=nums[j];
                }
                if(nums[j]>max)
                max=nums[j];
                int range=max-min;
                answer+=range;
            }      
        }
             return answer;   
    }
}