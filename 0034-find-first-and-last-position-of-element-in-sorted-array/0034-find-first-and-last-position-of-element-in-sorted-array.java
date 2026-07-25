class Solution {
    public int[] searchRange(int[] arr, int target) {
         int n=arr.length;
         Boolean flag=false;
        // binary search algo for first occurence
        int low =0,high=n-1,idx=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<target) low=mid+1;
            else if(arr[mid]>target) high=mid-1;
            else{
                high=mid-1;
                idx=mid;
                flag=true;

            }
        }
        
        
        // binary search for last occurnce
          int low2 =0,high2=n-1,idx2=-1;
        while(low2<=high2){
            int mid2=(low2+high2)/2;
            if(arr[mid2]<target) low2=mid2+1;
            else if(arr[mid2]>target) high2=mid2-1;
            else{
                low2=mid2+1;
                idx2=mid2;
                flag=true;
            }
        }
        if(flag){
            return new int[]{idx,idx2};
        }
        else{
            return new int[]{-1,-1};
        }
       

        
    }
}