class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
            List<Integer>res=new ArrayList<>();
            int n=arr.length;
            for(int i=0;i<n;i++){
                if(arr[i]==i+1){
                    continue;
                }
                else{
                    //swap
                    int temp=arr[i]-1;
                    int x=arr[i];
                    if(arr[i]==arr[temp]) continue;
                    arr[i]=arr[temp];
                    arr[temp]=x;
                    i--;
                }
            }
            for(int i=0;i<n;i++){
                if(arr[i]!=i+1){
                    res.add(i+1);
                }
            }
            return res;
        
    }
}