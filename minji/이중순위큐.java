import java.util.*;

class 이중순위큐 {
    public int[] solution(String[] operations) {
        int[] answer = { 0, 0 };
        PriorityQueue<Integer> q = new PriorityQueue<>();
        PriorityQueue<Integer> q2 = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < operations.length; i++) {
            String value = operations[i];
            String[] token = value.split(" ");
            if (token[0].equals("I")) {
                q.add(Integer.parseInt(token[1]));
                q2.add(Integer.parseInt(token[1]));
            } else {
                if (!q2.isEmpty()) {
                    if (token[1].equals("1")) {
                        int target = q2.peek();
                        q.remove(target);
                        q2.remove(target);
                    } else {
                        int target = q.peek();
                        q2.remove(target);
                        q.remove(target);
                    }
                }
            }
        }
        if (!q2.isEmpty()) {
            answer[0] = q2.peek();
            answer[1] = q.peek();
        }
        return answer;
    }
}