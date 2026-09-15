class Solution {
    public String sortSentence(String s) {
        int n=s.length();
        String answer="";
        
        
        String []arr=s.split(" ");
        String[] res=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            String str=arr[i];
            for(int j=0;j<str.length();j++){
                char ch=str.charAt(j);
                if(!((int)ch>=65 && (int)ch<=90 || (int)ch>=97 && (int)ch<=122)){
                   res[(int)ch-'0'-1]=str; // iss step se uss index pe jaake string daaldi par -1 issliye kra hai kyuki agar 4 hai to 4th index hoga nhi to issliye usse 3 rd pe add krna hai 
                    
                }
            }
        }
        for(int i=0; i<res.length; i++){
            answer += res[i].substring(0, res[i].length()-1) + " ";
            // ye step issliye kra taaki output this1 aa rha tha to hme 1 htan ahai t substring use kia hai  
}

    return answer.trim();

        
       
       
        
        
    }
}