class Solution {

    List<Integer> answer = new ArrayList<>();
    HashSet<Integer> ancestor = new HashSet<>();

    // 0 - not visited 
    // 1 - visited. a terminal nodes can be reached from here
    // -1 - visited. terminal node can not be reached from here 

    private boolean dfs(int[][] adj, int[] visited, int idx) {

        int[] temp = adj[idx];
        ancestor.add(idx);
        boolean result = true;

        for (int i = 0; i < temp.length; i++) {

            int next = temp[i];

            if (visited[next] == 1)
                continue;

            else if (ancestor.contains(next) || visited[next] == -1) {
                result = false;
            }

            else if (!dfs(adj, visited, next))
                result = false;
        }

        if (result) {
            visited[idx] = 1;
        }

        else
            visited[idx] = -1;

        ancestor.remove(idx);
        return result;
     
    }

    public List<Integer> eventualSafeNodes(int[][] adj) {

        int n = adj.length;

        int[] visited = new int[n];

        for (int i = 0; i < n; i++) {

            if (visited[i] != 0)
                continue;

            dfs(adj, visited, i);

        }

        for (int i = 0; i < n; i++)
            if (visited[i] == 1)
                answer.add(i);

        return answer;

    }
}