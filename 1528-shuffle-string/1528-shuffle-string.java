class Solution {
    public String restoreString(String s, int[] indices) {
        char [] str=new char[indices.length];
        
       
        for(int i=0;i<s.length();i++){
            str[indices[i]]=s.charAt(i);
        }
        return new String(str);


    }
}