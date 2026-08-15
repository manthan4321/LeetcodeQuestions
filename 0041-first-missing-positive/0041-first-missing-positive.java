class Solution {
    public int firstMissingPositive(int[] arr) {
        
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]==i+1) continue;
            else{
                // swap
                int temp=arr[i]-1;
                int x=arr[i];
                if(arr[i]<=0 || arr[i]>n) continue;
                else{
                if(arr[i]==arr[temp]) continue;
                else{
                arr[i]=arr[temp];
                arr[temp]=x;
                i--;

                }
                
                }     
                          
                

            }
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
           
        }
        return n+1;
        
        
    }
}