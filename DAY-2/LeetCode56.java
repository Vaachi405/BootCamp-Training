class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> arr = new ArrayList<>();
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        for(int x[]: intervals){
            if(arr.isEmpty() || arr.get(arr.size()-1)[1] < x[0]){
                arr.add(x);
            }
            else{
                arr.get(arr.size()-1)[1]= Math.max(arr.get(arr.size()-1)[1],x[1]);
            }
        }
        return arr.toArray(new int[arr.size()][]);
    }
}