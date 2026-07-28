class Solution {
    public int findKthPositive(int[] arr, int k) {
        // by o(logn) approach
        int n=arr.length;
        int low=0,high=n-1,idx=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int CorrectValue=mid+1;
            int Missing=arr[mid]-CorrectValue;
            if(Missing<k) // go right
            {
                low=mid+1;
                
            }
            else{ // do cases hi bchte hai ki agr barbar hai ya jyda hai to aage kyu hi jaana
            high=mid-1;
            
            

            }
        }
        return low+k;
        
    }
}