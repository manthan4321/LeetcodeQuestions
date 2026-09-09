class Solution {
    public long countCommas(long n) {
        long count=0;
        if(n<1000) return 0;
        if(n>=1000) count+= n-1000+1;
        if(n>=1000000) count+=(n-1000000+1);
        if(n>=1000000000) count+=(n-1000000000+1);
        if(n>=1000000000000L) count+=(n-1000000000000L+1);
        if(n>=1000000000000000L) count+= (n-1000000000000000L+1);
        return count;

    }
}
    // ye ques normal loop ki help se nhi hoga isme hmme formula pply krna pdega coz ye sirf formula se hi hoga wrna tle dega 
    // to steps agr n=1500 dia hai to total commas kya honge
    // <1000 wle sare 0 or 1000 se 1500 tak digits count karlo 1500-1000+1=501 digits itne hi comme honge 
    // bas hme ye formula 10 raise to power 15 tak karna hai coz constraints 10 raise t power 15 tak hi hai 
    // or ek chij yad rkhna ki *2,*3 ni krna coz agar no 2000000 hai to do condn chlegi pehle 1000 se bde wli fir 10000000 wli to already comma fil ho jayega
