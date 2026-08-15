class Solution {
    public int findDuplicate(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==i+1){
                continue;
            }
            else{
                int temp=arr[i]-1;
                int x=arr[i];
                if(arr[i]==arr[temp]) return arr[i];
                else{
                    arr[i]=arr[temp];
                    arr[temp]=x;
                    i--;

                }
               
                
            }
        }
        return n;
        
    }
}