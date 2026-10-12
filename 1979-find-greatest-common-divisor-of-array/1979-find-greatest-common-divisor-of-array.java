class Solution {
    public int hcf(int i,int j){
        if(i==0) return j;
        return hcf(j%i,i);
    }
    public int findGCD(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }

        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }

        }
        int x=hcf(min,max);
        return x;
        
    }
}