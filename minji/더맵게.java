import java.util.*;

class 더맵게 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            q.add(scoville[i]);
        }
        while (q.peek() < K) {
            if (q.size() >= 2) {
                int top = q.poll();
                if (top >= K) {
                    return answer;
                } else {
                    int second = q.poll();
                    q.add(top + (second * 2));
                    answer++;
                }
            } else {
                return -1;
            }
        }
        return answer;
    }
}