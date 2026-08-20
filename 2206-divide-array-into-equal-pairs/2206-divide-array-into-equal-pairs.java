class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int n=nums.length/2;
        int i=0,j=i+1;
        while(i<nums.length && j<nums.length){
            if(nums[i]==nums[j]){
                count++;
            }
            i+=2;
            j+=2;
        }
        if(count==n){
            return true;
        }
        return false;

        
        
    }
}