class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        // Count frequency of each task
        for (char task : tasks) {
            freq[task - 'A']++;
        }

        // Find maximum frequency
        int maxFreq = 0;
        for (int count : freq) {
            maxFreq = Math.max(maxFreq, count);
        }

        // Count how many tasks have maximum frequency
        int maxFreqTasks = 0;
        for (int count : freq) {
            if (count == maxFreq) {
                maxFreqTasks++;
            }
        }

        // Minimum length forced by the most frequent tasks
        int skeleton = (maxFreq - 1) * (n + 1) + maxFreqTasks;

        // Either the skeleton forces idle time,
        // or we can fill everything with actual tasks.
        return Math.max(tasks.length, skeleton);
    }
}