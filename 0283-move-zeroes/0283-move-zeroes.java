class Solution {
    public void moveZeroes(int[] arr) {
        int n=arr.length;
        int noz=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                noz++;
            }
        }
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        while(noz!=0){
            arr[index]=0;
            index++;
            noz--;

        }

    }
}