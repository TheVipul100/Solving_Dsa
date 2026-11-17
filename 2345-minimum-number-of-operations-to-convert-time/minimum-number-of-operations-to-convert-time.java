class Solution {

    public int HtoM(String str)
    {
        return Integer.parseInt(str.substring(0,2))*60 +  Integer.parseInt(str.substring(3,5));
    }
    public int convertTime(String current, String correct) {
        int diff = HtoM(correct) - HtoM(current);

        int result = 0;  //final time
    
        int arr[] = {60,15,5,1};

        for(int i:arr)
        {
            result += diff/i;
            diff %=i;
        }
        return result;

            


         



    }
}