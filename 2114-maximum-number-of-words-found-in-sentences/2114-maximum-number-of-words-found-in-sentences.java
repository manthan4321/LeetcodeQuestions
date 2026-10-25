class Solution {
    public int mostWordsFound(String[] sentences) {
        //iss ques me hame  ye karna hai ki hame jo string array given hai usme sentences hai to hame ye krna hai ki un sentences ke words ko ginna hai or jiske words sbse jyda honge wo return karane hai
        // logic step by step
        //step1->sbse pehle string pe traverse karo then har sentence ko string me store krwado
        //step2->now ab jo hmne string ke andr store krwai hai uspe traverse karo and words count karlo 
        // step3->words count karne ke liye hmare pass koi specific method nhi hai to ham ye krenge ki spaces count karenge kyuki main logic hi yhi hai ki words=spaces+1
        // step 4 ->ye sb count reset pattern follow krega to sbhi variable loop ke andar bnenge
        // step 5->max words wla return karana hai to max wla algo follow hoga at last


        int maxwords=-1;
        int n=sentences.length;
        for(int i=0;i<n;i++){
            String s=sentences[i];
            int spaces=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==' '){
                    spaces++;
                }
            }
            int words=spaces+1;
            if(words>maxwords){
                maxwords=words;
            }

        }
        return maxwords;
    }
}