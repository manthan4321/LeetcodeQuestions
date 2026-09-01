class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer>res=new ArrayList<>();
        
        int n=nums.length;
        int i=0;
        while(i<n){
            int freq=nums[i];
            int val=nums[i+1];
            
            for(int j=0;j<freq;j++){
                res.add(val);
            }
            i+=2;
        }
        int []arr=new int[res.size()];
        for(int k=0;k<res.size();k++){
            arr[k]=res.get(k);

        }
        return arr;
        
    }
}