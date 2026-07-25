class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int idx=-1;
        Boolean flag=false;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<target) {
                low=mid+1;
            }
            else if(nums[mid]>target) 
            {high=mid-1;
            }
            else{
                idx=mid;
                return mid;
            }


        }
        return low;
        
        
    }
}