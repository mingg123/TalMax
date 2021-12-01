import java.util.*;
class 네트워크 {
    public static boolean [] visit;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visit = new boolean[n];
        for(int i = 0; i < computers.length; i++) {
            if(!visit[i]) {
                answer++;
                dfs(i, computers);
            }
            
        }
        return answer;
    }
    public void dfs(int idx, int [][]computers) {
        visit[idx] = true;
        for(int i = 0; i < computers.length; i++) {
            if(!visit[i] && i != idx && computers[idx][i] == 1) {
                dfs(i, computers);
            }
        }
    }
}