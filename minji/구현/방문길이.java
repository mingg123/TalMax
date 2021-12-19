package minji.구현;
import java.util.*;

class 방문길이 {
    public int solution(String dirs) {
        boolean[][][][] visit = new boolean[11][11][11][11];
        int[] dx = { 0, 0, 1, -1 };
        int[] dy = { 1, -1, 0, 0 };
        int nextx = 5;
        int nexty = 5;
        int answer = 0;
        int index;
        int x, y;
        for (int i = 0; i < dirs.length(); i++) {
            x = nextx;
            y = nexty;
            char temp = dirs.charAt(i);
            switch (temp) {
                case 'U':
                    index = 0;
                    break;
                case 'D':
                    index = 1;
                    break;
                case 'R':
                    index = 2;
                    break;
                case 'L':
                    index = 3;
                    break;
                default:
                    index = 0;
                    break;
            }
            nextx += dx[index];
            nexty += dy[index];
            if (nextx > 10 || nexty > 10 || nextx < 0 || nexty < 0) {
                nextx -= dx[index];
                nexty -= dy[index];
                continue;
            }
            if (!visit[nextx][nexty][x][y] && !visit[x][y][nextx][nexty]) {
                answer++;
                visit[nextx][nexty][x][y] = true;
                visit[x][y][nextx][nexty] = true;
            }
        }

        return answer;
    }
}