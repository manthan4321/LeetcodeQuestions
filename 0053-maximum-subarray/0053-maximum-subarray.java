class Solution {
    public int maxSubArray(int[] nums) {
        // Most imp BY kedanes algorithm
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
              
        if(sum>maxsum){  // we written this inside loop because agr loop ke bahar likha then ye pure array ka sum calculate krega or maxsum ke sath pure elements ke sum ka comparison hoga or agr single single element ke sath krwana hai to loop ke andar likho
            maxsum=sum;
        }
         if(sum<0){
            sum=0;
        }
        }
       
       



       
        return maxsum;
        
    }
}