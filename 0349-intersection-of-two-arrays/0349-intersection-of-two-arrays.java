class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]) arr.add(nums1[i]);
            }
        }
        int []res=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i]=arr.get(i);
            
        }
        
        ArrayList<Integer>arr2=new ArrayList<>();
        Arrays.sort(res);
        if(res.length==0) return res; // agr koi intersection mile hi na
        arr2.add(0,res[0]);
        for(int i=1;i<res.length;i++){
            if(res[i]==res[i-1]) continue;
            else{
                arr2.add(res[i]);
            }

        }
        int []res2=new int[arr2.size()];
        for(int i=0;i<arr2.size();i++){
            res2[i]=arr2.get(i);

        }
        return res2;
        
    }
}