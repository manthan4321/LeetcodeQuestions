class Solution {
    public String truncateSentence(String s, int k) {
        String []arr=s.split(" +");
        String ans="";
        for(int i=0;i<k;i++){
            String ele=" ";
            if(i==k-1)  ele=arr[i];
            else{
                ele=arr[i]+" ";
            }
           
            ans+=ele;

        }
      
        return ans;
        
    }
}