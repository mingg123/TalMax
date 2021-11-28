import java.util.*;

class 주식가격 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int target = prices[i];
            int count = 1;
            for (int j = i + 1; j < prices.length - 1; j++) {
                if (target <= prices[j]) {
                    count++;
                } else {
                    break;
                }
            }
            answer[i] = count;
        }
        answer[prices.length - 1] = 0;
        return answer;
    }
}