class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        ArrayList<Integer>arr1=new ArrayList<>();
        ArrayList<Integer>arr2=new ArrayList<>();
        List<List<Integer>>answer=new ArrayList<>();
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums1[i]==nums2[j]) count++;

            }
            if(count==0) arr1.add(nums1[i]);
        }
        // ab sare distinct elements to aagye dono array se par agr usme bhi duplicates hue to vo remove krne hai
        int []temp1=new int[arr1.size()];
        for(int i=0;i<arr1.size();i++){
            temp1[i]=arr1.get(i);
        }
        Arrays.sort(temp1);
        ArrayList<Integer>ans1=new ArrayList<>();
        if(temp1.length==0){
            ArrayList<Integer>empty=new ArrayList<>();
            answer.add(empty);
        }
        else{
            ans1.add(0,temp1[0]);
        for(int i=1;i<temp1.length;i++){
            if(temp1[i]!=temp1[i-1]){
                ans1.add(temp1[i]);
            }
        }
        answer.add(ans1);

        }
        
// now for 2nd array
         

        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(nums1[j]==nums2[i]) count++;

            }
            if(count==0) arr2.add(nums2[i]);
        }

        int []temp2=new int[arr2.size()];
        for(int i=0;i<arr2.size();i++){
            temp2[i]=arr2.get(i);
        }
        Arrays.sort(temp2);
        ArrayList<Integer>ans2=new ArrayList<>();
        if(temp2.length==0){
            ArrayList<Integer>empty2=new ArrayList<>();
            answer.add(empty2);
        }
        else{
            ans2.add(0,temp2[0]);
        for(int i=1;i<temp2.length;i++){
            if(temp2[i]!=temp2[i-1]){
                ans2.add(temp2[i]);
            }
        }
        answer.add(ans2);

        }
        
        

        return answer;


        
    }
}