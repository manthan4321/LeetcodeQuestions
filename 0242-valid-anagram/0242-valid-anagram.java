class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        int m=s.length();
        int n=t.length();
        for(int i=0;i<m;i++){
            char ch=s.charAt(i);
            if(map1.containsKey(ch)){
                int freq=map1.get(ch);
                map1.put(ch,freq+1);
            }
            else{
                map1.put(ch,1);
            }
        }
        for(int i=0;i<n;i++){
            char ch=t.charAt(i);
            if(!map1.containsKey(ch)) return false; // ye check point iss liye taaki agr koi element string me aisa ho jo dusri me ho hi na to yhn hi end ho jaye code aage jaye hi na
            if(map2.containsKey(ch)){
                int freq=map2.get(ch);
                map2.put(ch,freq+1);
            }
            else{
                map2.put(ch,1);
            }
        }
        
        // now check krte hai kya ye whether b is subset or not by comparing frequencies
        for(char ele:map2.keySet()){
            int freq1=map1.get(ele);
            int freq2=map2.get(ele);
            if(freq1!=freq2) return false;
        }
        return true;
    }
}