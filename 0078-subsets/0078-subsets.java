class Solution {
    public static void Subset(List<Integer>ans,int []num,int idx,List<List<Integer>>f){
        if(idx==num.length){
         f.add(new ArrayList<>(ans));
         return;
        }
        ans.add(num[idx]); // pick ke liye aise krna hota hai
        Subset(ans,num,idx+1,f);

        // skip ke liye wapas jake remove karoo
        ans.remove(ans.size()-1);

        Subset(ans,num,idx+1,f);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        Subset(new ArrayList<>(),nums,0,res);
        return res;
        
    }
}