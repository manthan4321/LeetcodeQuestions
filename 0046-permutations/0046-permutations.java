class Solution {
    public static void Permutation(int [] nums,List<Integer>arr,List<List<Integer>>res){
        if(arr.size()==nums.length){
            ArrayList<Integer>temp=new ArrayList<>(arr);
            res.add(temp);
            return;
        }
        
        
        for(int i=0;i<nums.length;i++){
            if(arr.contains(nums[i])){
                continue;
            }
            arr.add(nums[i]);
            Permutation(nums,arr,res);
            arr.remove(arr.size()-1);
        }



    }
    
    
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>arr=new ArrayList<>();
        Permutation(nums,arr,res);
        return res;
    }
}