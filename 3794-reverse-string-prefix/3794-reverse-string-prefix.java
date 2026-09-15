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
    public String reversePrefix(String s, int k) {
        char []arr=s.toCharArray();
        reverse(0,k-1,arr);
        return new String(arr);
        
    }
}