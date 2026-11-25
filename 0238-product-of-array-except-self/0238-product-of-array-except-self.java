class Solution {
    public int[] productExceptSelf(int[] nums) {

        int prefix = 1;
        int suffix = 1;

        int[] res = new int[nums.length];

        for(int i = 0; i < res.length; i++) {
            res[i] = 1;
        }

        for(int i = 1; i < nums.length; i++) {
            prefix *= nums[i-1];
            res[i] = prefix;
        }

        for(int i = nums.length-2; i >= 0; i--) {
            suffix *= nums[i+1];
            res[i] *= suffix; // prefix wle se sufix wlo ko multiply krdia
        }

        return res;
    }
}