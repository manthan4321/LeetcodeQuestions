class Solution {
    public int maximumCount(int[] nums) {
        // logic -2 binary search for neg and pos integers
        // 1st binary search for neg
        int n=nums.length;
        int lo=0,hi=n-1,idx1=n;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            // koi aisa no jiske piche sare hi neg no ho wo dhudho
            if(nums[mid]>=0){
                //mark and go left kyuki kya pta first positive ya zero usse pehle ho]
                idx1=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        // now 2nd binary search for positive integers
        int low=0,high=n-1,idx2=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>0){
                //mark and go left kya pta usse pehle wla bhi first positive ho
                idx2=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
                
            }
        }
        int positive=nums.length-idx2;
        return Math.max(idx1,positive);// n- idx2 issliye kyuki neg nikaaLNE to easy hai jitna idx utne hi -ve no par in case of positive n-idx2

        
    }
}