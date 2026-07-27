class Solution {
    public int search(int[] arr, int target) {
         // code here
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target) return mid;
            // now left right movements
            //view notes line by line
           else if(arr[low]<=arr[mid]) //left part sorted
           {
               if(arr[low]<=target && target<arr[mid]) high=mid-1;
               else{
                   low=mid+1;
               }
               
           }
           else // right part is sorted
           {
               if(arr[mid]<target && target<=arr[high]) low=mid+1;
               
               else high=mid-1;
               
           }
        }
        return -1;
        
    }
}