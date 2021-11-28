import java.util.*;

class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        for (int i = 0; i < progresses.length; i++) {
            progresses[i] = 100 - progresses[i];
        }
        int[] day = new int[progresses.length];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int div = progresses[i] % speeds[i];
            day[i] = progresses[i] / speeds[i];
            if (div > 0) {
                day[i]++;
            }
            queue.add(day[i]);
        }
        int count = 1;
        int top = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            if (count == 1) {
                top = queue.poll();
            }
            if (queue.size() != 0) {
                int next = queue.peek();
                if (top >= next) {
                    count++;
                    queue.remove(next);
                } else {
                    result.add(count);
                    count = 1;
                }
            }
        }
        result.add(count);
        answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}