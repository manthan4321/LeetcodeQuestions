class Solution {
    public int specialArray(int[] nums) {
        int n=nums.length;
        //logic-> ek noo assume karo pure array me traverse krke uss no ke equal to ya usse bde elements calculate karo and agr unka count us assumed no ke equal aa jata hai to return kardo
        // or vo jo no hai vo array ke size se bda nhi ho skta usse chota ho skta hai

        for(int x=0;x<=n;x++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[j]>=x){
                    count++;
                }

            }
            if(count==x){
                return x;
            }
        }
        return -1;


        
        
    }
}