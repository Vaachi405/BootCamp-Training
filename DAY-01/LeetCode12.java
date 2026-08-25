class Solution {
    public String intToRoman(int num) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        // Parallel arrays to store decimal values and their corresponding Roman symbols
        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            
            while (num >= values[i]) {
                // While the current value can be subtracted from num
                roman.append(symbols[i]); 
                num -= values[i]; 
                // Append the symbol and reduce num by the value
            }
        }
        return roman.toString();
    }
}