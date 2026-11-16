class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++){
          int left=i-1,right=i+1;
          if(flowerbed[i]==0  && (left<0 || flowerbed[left]==0) && (right>=flowerbed.length || flowerbed[right]==0)){
            flowerbed[i]=1;
            n--;
          }
        
        if(n<=0){
            return true;
        }
    }
    return false;
    }
}