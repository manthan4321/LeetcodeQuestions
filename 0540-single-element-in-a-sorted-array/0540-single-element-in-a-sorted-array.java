class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n=arr.length;
        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];

        // now binary search algo
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]) return arr[mid];
            // now for left right movements
            int first=mid,last=mid;
            if(arr[mid]==arr[mid-1]) first=mid-1;
            else if(arr[mid]==arr[mid+1]) last=mid+1;
            // now count of left and right part
            int leftcount=first-lo;
            int rightcount=hi-last;

            if(leftcount%2==0){
                // go right
                lo=last+1;
            }
            else{
                hi=first-1;
            }
        }
        return 2;
        
    }
}