class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean num1 = false;
        boolean num2 = false;
        boolean num3 = false;

        for(int[] t:triplets){
            if(t[0]<=target[0] && t[1]<=target[1] && t[2]<=target[2]){
                if(t[0]==target[0]) num1=true;
                if(t[1]==target[1]) num2=true;
                if(t[2]==target[2]) num3=true;
            }
        }
        return num1 && num2 && num3;
    }
}