package minji;

import java.util.*;

class 카페 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = yellow;
        int row = 1;
        int col = 1;
        for (int i = 1; i <= total; i++) {
            row = i;
            if (total % i == 0) {
                col = total / i;
                if (row >= col) {
                    if (row * 2 + col * 2 + 4 == brown) {
                        row = row + 2;
                        col = col + 2;
                        break;
                    }
                }
            }
        }
        answer[0] = row;
        answer[1] = col;
        return answer;
    }
}