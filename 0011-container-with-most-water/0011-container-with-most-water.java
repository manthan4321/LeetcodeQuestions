class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0,j=n-1;
        int maxarea=Integer.MIN_VALUE;
        
        while(i<j){
            int l=Math.min(height[i],height[j]);
            int b=j-i;
            int area=l*b;
            maxarea=Math.max(area,maxarea);
            if(height[i]<=height[j]) i++;
            else j--;

        }
        return maxarea;
    }
}