class Solution {
    public String frequencySort(String s) {
        // int count =0;
        int freq[]  = new int[128];
        for(int i=0;i<s.length();i++)
          {
            
            freq[s.charAt(i)]++;
          }
    
    StringBuilder sb = new StringBuilder();
    
          while(true)
          {
            int count =0;
            for(int j=0;j<128;j++)
            {
                if(freq[j] > freq[count])
                count = j;
            }

            if(freq[count] == 0)
            break;

        for (int k = 0; k < freq[count]; k++) {
            sb.append((char) count);
        }
                freq[count] = 0;  
    }
         return sb.toString();    
    }
}