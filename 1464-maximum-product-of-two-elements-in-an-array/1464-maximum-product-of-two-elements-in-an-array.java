class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxi=-1;
        for(int i=0;i<n;i++){
            int product=1;
            for(int j=i+1;j<n;j++){
                product=(nums[i]-1)*(nums[j]-1);
                if(product>maxi){
                maxi=product;
            }
            }
            
        }
        return maxi;
        
    }
}