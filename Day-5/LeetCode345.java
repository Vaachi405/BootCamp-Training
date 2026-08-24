class Solution {
    public String reverseVowels(String s) {
      char[] res= s.toCharArray();  
      int start=0;
      int end= s.length()-1;
      String vowels= "AaEeIiOoUu";
      while(start<end){
        if (vowels.indexOf(res[start]) == -1) {
            start++;
        } 
        
        else if (vowels.indexOf(res[end]) == -1) {
            end--;
        } 
        
        else {
            char temp = res[start];
            res[start] = res[end];
            res[end] = temp;
            start++;
            end--;
        }
      }
      String ans= new String(res);
      return ans;
    }
}