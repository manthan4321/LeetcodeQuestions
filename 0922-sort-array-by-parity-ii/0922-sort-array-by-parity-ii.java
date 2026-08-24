class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer>arr1=new ArrayList<>();
        ArrayList<Integer>arr2=new ArrayList<>();
        ArrayList<Integer>res=new ArrayList<>();
        int [] result=new int[nums.length];

        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                arr1.add(nums[i]);
            }
            else{
                arr2.add(nums[i]);
            }
        }
        int index1=0;
        int index2=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                res.add(arr1.get(index1));
                index1++;
            }
            else{
                res.add(arr2.get(index2));
                index2++;
            }
            
            
        }
        for(int i=0;i<res.size();i++){
            result[i]=res.get(i);

        }
        return result;
        
    }
}