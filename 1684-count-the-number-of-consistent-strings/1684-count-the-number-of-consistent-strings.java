class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
       
        
        for(int i=0;i<words.length;i++){
            Boolean flag=false;
            String ans="";
            ans+=words[i];
            for(int j=0;j<ans.length();j++){
                String ch="";
                ch+=ans.charAt(j);
                if(allowed.contains(ch)) continue;
                else{
                    flag=true;
                }
            }
            if(flag==false){
                count++;
            }
            }
            return count;
            }
            
            
        }
        
       
    
