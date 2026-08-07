class Solution {
    // no we are solving it by recursion  

    public int binary(int[] nums, int target,int lo,int hi) {
        if(lo>hi) return -1;
        int mid=lo+(hi-lo)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]>target) // bs ab yhn change aayega recursion se kyuki in recursion hme search space chota krna hota hai to jab mid target se bda hota hai toh hm left jate hai matlab search space is lo,mid-1 tak or else case me right to mid+1 se hi tak jate hai
        {
            return binary(nums,target,lo,mid-1);
        }
        else return binary (nums,target,mid+1,hi);
        
        
    }
    public int search(int[] nums, int target) {
        return binary(nums,target,0,nums.length-1);

        
    }
}