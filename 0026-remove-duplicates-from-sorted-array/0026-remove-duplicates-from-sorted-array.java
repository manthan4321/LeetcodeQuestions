class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>res=new ArrayList<>();
        res.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                res.add(nums[i]);
            }

        }
        // iss ques me array bhi shi krna hai akela iss output se kaam nhi hoga
        for(int i=0;i<res.size();i++){
            nums[i]=res.get(i);
        }
        return res.size();
        
    }
}