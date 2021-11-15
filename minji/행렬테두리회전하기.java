import java.util.*;
public class 행렬테두리회전하기 {
class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int [queries.length];
        int [][] map = new int [rows][columns];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                map[i][j] = i * columns + j +1;
            }
        }
        for(int j = 0; j < queries.length; j++) {
          
            int min = 1000000;
            int x1 = queries[j][0] -1;
            int y1 = queries[j][1] -1;
            int x2 = queries[j][2] -1;
            int y2 = queries[j][3] -1;
            int temp = map[x1][y1];
       
            
            // 1번 방향
            for(int i = x1; i < x2; i++) {
                map[i][y1] = map[i+1][y1];
                if(min > map[i][y1]) {
                    min = map[i][y1];
                }
                // System.out.println(map[i][y1] + " ");
            }
            //2번 방향
            for(int i = y1; i < y2; i++) {
                map[x2][i] = map[x2][i+1];
                if(min > map[x2][i]) {
                    min = map[x2][i];
                }
                 // System.out.println(map[x2][i] + " ");
            }
            //3번 방향
            for(int i = x2; i > x1; i--) {
                map[i][y2] = map[i-1][y2];
                if(min > map[i][y2]) {
                    min = map[i][y2];
                }
                  // System.out.println(map[i][y2] + " ");
            }
          
            // 4번 방향 
           for(int i = y2; i > y1; i--) {
                map[x1][i] = map[x1][i-1];
                if(i-1 == y1){
                    map[x1][i] = temp;
                }
                if(min > map[x1][i])
                {
                    min = map[x1][i];
                }
                // System.out.println(map[x1][i] + " ");
            }
            
            answer[j] = min;
        }
        return answer;
    }
}
}
