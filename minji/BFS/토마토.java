package minji.BFS;
import java.util.*;

class tomato {
    int x;
    int y;
    tomato(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class 토마토 {    
    public static int N;
    public static int M;
    public static int [][] arr;
    public static boolean [][] visit;
   public static int[] dx = {-1,1,0,0};
   public static int[] dy = {0,0,-1,1};
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        arr = new int[N][M];
        visit = new boolean[N][M];
        Queue <tomato>  q= new LinkedList<tomato>();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j] == 1) {
                    q.add(new tomato(i, j));
                }
            }
        }
       
        while(!q.isEmpty()) {
            int x = q.peek().x;
            int y = q.peek().y;
            q.poll();
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >=0 && nx < N && ny >=0 && ny<M ) {
                    if(arr[nx][ny] == 0) {
                        arr[nx][ny] = arr[x][y] + 1;
                        q.add(new tomato(nx, ny));
                    }
                }
            }
        }
        
        int result = Integer.MIN_VALUE;
        for(int i =0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(arr[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                result  = Math.max(result, arr[i][j]);
            }
        }
        if(result ==1) {
            System.out.println(0);
        } else {
            System.out.println(result-1);
        }
    }

}
