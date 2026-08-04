class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        ArrayList<Integer>arr2=new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        // min and max find krke uske bich traverse karo and then check kreenge
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
            max=arr[i];
        }
        }
        
     

        for(int i=min;i<=max;i++){
            boolean found=false;
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    found =true;
                }

            }
            if(found!=true){
                arr2.add(i);
            }
        }
        return arr2;
        
}
}