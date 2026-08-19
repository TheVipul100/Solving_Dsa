class Solution {

    public int[] topse(int[] arr){
        int n=arr.length;
          Stack<Integer> st= new Stack<>();
          int ans[]=new int[n];

          for(int i=0;i<n;i++)
          {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            st.pop();

            ans[i] = st.isEmpty() ? -1: st.peek();

            st.push(i); 
          }
          return ans;
    }

      public int[] tonse(int[] arr){
         int n=arr.length;
          Stack<Integer> st= new Stack<>();
          int ans[]=new int[n];

          for(int i=n-1;i>=0;i--)
          {
            while(!st.isEmpty() && arr[st.peek()]>arr[i])
            st.pop();

            ans[i]  = st.isEmpty() ? n : st.peek();

            st.push(i); 
          }
          return ans;
    }


    public int sumSubarrayMins(int[] arr) {
       int n=arr.length;
       long sum=0, mod=(int)1e9+7;
        
        int[] nse = tonse(arr);
        int[] pse = topse(arr);

       for(int i=0;i<n;i++)
       {
        int left=i-pse[i];
        int right=nse[i]-i;
          
          sum= (sum + ((long) left*right *arr[i]) % mod) % mod;
       }
      return (int)sum;
    //     for(int i=0;i<n;i++)
    //     {
    //         int mini=arr[i];
    //         for(int j=i;j<n;j++)
    //         {
    //             mini=Math.min(mini,arr[j]);
    //             sum=(sum+mini)%mod;
    //         }
    //     }
    }
}