class Solution {
    
    static boolean[] visited;
    static int answer;
    static int[][] dungeonsArr;
    
    public int solution(int k, int[][] dungeons) {
        dungeonsArr = dungeons;
        visited = new boolean[dungeonsArr.length];
        
        dfs(k, 0);
        
        return answer;
    }
    
    static void dfs(int current, int count) {
        answer = Math.max(answer, count);
        
        for (int i = 0; i < dungeonsArr.length; i++) {
            if (!visited[i] && current >= dungeonsArr[i][0]) {
                visited[i] = true;
                dfs(current - dungeonsArr[i][1], count + 1);
                visited[i] = false;
            }
        }
    }
}