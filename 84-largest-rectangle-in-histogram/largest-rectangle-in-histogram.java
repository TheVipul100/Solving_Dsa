class Solution {

    public int[] topsv(int[] arr)
    {
         int n=arr.length;
         Stack<Integer> st= new Stack<>();
         int[] ans=new int[n];

         for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            st.pop();

        ans[i]= st.isEmpty() ? -1 : st.peek();

        st.push(i);
         }
         return ans;
    }
     public int[] tonsv(int[] arr)
     {
 int n=arr.length;
         Stack<Integer> st= new Stack<>();
         int[] ans=new int[n];

         for(int i=n-1;i>=0;i--)
         {
            while(!st.isEmpty() && arr[st.peek()]>arr[i])
            st.pop();

        ans[i]= st.isEmpty() ? n : st.peek();

        st.push(i);
         }
         return ans;
     }

    public int largestRectangleArea(int[] heights) {
       int maxArea = 0, n = heights.length;
        int[] psv=topsv(heights);
        int[] nsv=tonsv(heights);
          
          for(int i=0;i<n;i++)
          maxArea = Math.max(maxArea,(heights[i] * (nsv[i]- psv[i] -1)));
          
        return maxArea;
    }
}