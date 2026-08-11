class Solution {
    public String interpret(String s) {
        String str="";
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='G'){
                str+="G";
            }
            else if(s.charAt(i)=='(' && s.charAt(i+1)==')'){
                str+="o";
                
            }
            else if(s.charAt(i)=='(' && s.charAt(i+1)=='a' && s.charAt(i+2)=='l' && s.charAt(i+3)==')'){
                str+="al";
            }
                
            
        }
        return str;

        
    }
}