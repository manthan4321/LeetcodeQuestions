class Solution {
    public int[] pivotArray(int[] arr, int pivot) {
       ArrayList<Integer>res=new ArrayList<>();
       int n=arr.length;
       for(int i=0;i<n;i++){
        if(arr[i]<pivot){
            res.add(arr[i]);
        }
       }
       for(int i=0;i<n;i++){
        if(arr[i]==pivot){
            res.add(arr[i]);
        }
       }
       for(int i=0;i<n;i++){
        if(arr[i]>pivot){
            res.add(arr[i]);
        }
       }
       for(int i=0;i<res.size();i++){
            arr[i]=res.get(i);
       }
       return arr;

        
    }
}