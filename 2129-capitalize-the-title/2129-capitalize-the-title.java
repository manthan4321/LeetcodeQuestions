class Solution {
    public String capitalizeTitle(String title) {
        String s=title.toLowerCase();
        String res="";
        String []arr=s.split(" ");
        int n=arr.length;
        for(int i=0;i<n;i++){
            String ans=arr[i];
            if(ans.length()==2 || ans.length()==1){
                res+=ans+" ";
            }
            else{
            ans=Character.toUpperCase(ans.charAt(0))+ans.substring(1);
            res+=ans+" ";
            

            }
            

            
        }
        return res.trim();
        
    }
}