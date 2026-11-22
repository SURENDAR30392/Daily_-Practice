class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int k=0;
        while(i<j){
            int width=j-i;
            int maxi=Math.min(height[i],height[j]);
            k=Math.max(k,width*maxi);
            if(height[i]<height[j]){
                i++;
            }
            else if(height[i]==height[j]){
                j--;
                i++;
            }
            else{
                j--;
            }
        }
        return k;
    }
}