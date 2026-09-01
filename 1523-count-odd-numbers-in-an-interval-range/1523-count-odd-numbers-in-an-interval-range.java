class Solution {
    public int countOdds(int low, int high) {
        // in this ques normal brute force kaam nhi kregi kyuki 2 test case kaafi bde hai or vo long se bhi nhi niklenge to iss ques ka logic ye hoga ki ham total no of odd numbers aise nikaalte hai 
        // n+1/2
        // to agr merko sare odd number nikaalne hai 3 se 9 tak to iska ek formula bnnana pdega
        // sbse pehle 1 se high tak odd nikaalo
        //example low =3,high =7 to odd no for 1 to high->high+1/2;
        // par isse 1 bhi extra aa jayega to agr vo htana hai to ham total high tak ke odd numbers me se agr low se pehle wle saare odd number hta du to whi ans hoga matlab 
        // odd numbers before low== low-1 +1/2 to ye ho jayega low /2;
        // main formula high+1/2 -low/2;
        return ((high+1)/2)-(low/2);
        
    }
}