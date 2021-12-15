import java.util.*;
class 가장큰사각형찾기
{
    public int solution(int [][]board)
    {
        int [][] newboard = new int[board.length+1][board[0].length+1];
        for(int i = 0; i < board.length; i++) {
            for(int j =0; j < board[i].length; j++) {
                newboard[i+1][j+1] = board[i][j];
            }
        }
        int answer = 0;
        for(int i = 1; i < newboard.length; i++) {
            for(int j = 1; j < newboard[i].length; j++) {
                if(newboard[i][j] == 1) {
                    int up = newboard[i-1][j];
                    int left = newboard[i][j-1];
                    int leftup = newboard[i-1][j-1];
                    int min = Math.min(up, Math.min(left, leftup));
                    newboard[i][j] = min+1;
                    answer = Math.max(answer, newboard[i][j]);
                }
            }
        }

        return answer * answer;
    }
}