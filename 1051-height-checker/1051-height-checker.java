class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int count=0;
        int []expected=new int[n];
        for(int i=0;i<n;i++){
            expected[i]=heights[i];
        }
        Arrays.sort(expected);
        int i=0,j=0;
        while( i<heights.length && j<expected.length){
            if(heights[i]!=expected[i]){
                count++;
            }
            i++;
            j++;

        }
        return count;

        
    }
}