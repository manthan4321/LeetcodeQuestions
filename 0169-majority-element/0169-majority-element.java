class Solution {
    public int majorityElement(int[] nums) {
        // ab ye approach kuch aise hai ki isme agr ham array sort karde 
        // to array aise bnega ki jo majority me hai vo array ke n/2 pe aayega 
        // jaise [3,2,3] = [2,3,3] n/2th element konsa hoga-3rd to whi ans hoga
        // ye optimized approach hai
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n/2];

        
    }
}