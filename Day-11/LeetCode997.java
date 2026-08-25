class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustSc = new int[n+1];
        
        for(int[] t: trust){
            trustSc[t[0]]--;
            trustSc[t[1]]++;
        }

        for(int i=1; i<=n; i++){
            if(trustSc[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}