class Solution {
    public String frequencySort(String s) {
        int []arr=new int[128];
        String str="";
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int ascii=(int)(ch);
            arr[ascii]++;
        }
        while(true){

        
        int index=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                index=i;

            }
           

        }
        if(max==0) break;

        
        for(int i=0;i<max;i++){
            str+=(char)(index);
        }
        arr[index]=0;
        }
        return str;
        
        
    }

    // logic of solving this code ->
    //step1)Frequency array fill kardo ek ascii value nikaalke array ke ke uss index pe jake ++ kardo
    //step2) ab puri frequency fill ho chuki hai ab ye karna hai ki maximum frequency wla pehle aaye baaki sare bad me
    //step3)ab max find krke array me ,ek loop or chalao 0 se max tak or (index store krwa lena max wle ka) uss index ko char me convert karke string me add kardo
    //step4)ab main step highest wla to fill hogya ab baaki kaise fill kre?
    //step5)ab uss highest wla index pe 0 fill kardo (kyuki 2wla hogya to ab 1 wla max me add hoga fir jab sare ho jayenge fir jaise hi 0 wle aajenge to usme hm break condn lgayenge or loop infinite tak hi chlayenge)
    
}