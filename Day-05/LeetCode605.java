class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l= flowerbed.length;
        for(int i=0; i<l; i++){
            if(flowerbed[i]==0){
                int prev= (i==0) ? 0 : flowerbed[i-1];
                int next= (i==l-1) ? 0 : flowerbed[i+1];

                if(prev==0 && next==0){
                    flowerbed[i]=1;
                    n--;
                    i++;
                }
            }
        }
        return n<=0;
    }
}