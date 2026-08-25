class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();

        // First row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        answer.add(firstRow);

       
        for (int i = 1; i <= numRows-1; i++) {

            List<Integer> prevRow = answer.get(i - 1);
            List<Integer> currRow = new ArrayList<>();

            currRow.add(1); // first element

            for (int j = 1; j < i; j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            currRow.add(1); // last element
            answer.add(currRow);
        }

        return answer; 
    }
}