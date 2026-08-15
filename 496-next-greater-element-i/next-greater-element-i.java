class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            int ng=-1, target=nums1[i];
            boolean found=false;

            for(int j=0;j<nums2.length;j++)
            {
                if (nums2[j] == target) {
                    found = true;
                } 
                else if (found) {
                    if (nums2[j] > target) {
                        ng = nums2[j];
                        break;
                    }
                }
            }
               ans[i]= ng;
        }
        return ans;
    }
}