class Solution {
    public void reverse(int i,int j,char []arr){
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
    }
    
    public String reversePrefix(String word, char ch) {
        int n=word.length();
        int idx=-1;
        for(int i=0;i<n;i++){
            char chr=word.charAt(i);
            if(chr==ch){
                idx=i;
                break;
            }
            
        }
        char []arr=word.toCharArray();
        reverse(0,idx,arr);
        return new String(arr);


        
    }
}