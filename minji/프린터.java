package minji;

import java.util.*;

class 프린터 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<print> q = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            q.add(new print(priorities[i], i));
        }
        int count = 0;
        while (!q.isEmpty()) {
            print top = q.poll();
            boolean flag = false;
            for (print pr : q) {
                if (top.prior < pr.prior) {
                    flag = true;
                }
            }
            if (flag) {
                q.add(top);
            } else {
                count++;
                if (top.idx == location) {
                    answer = count;
                    break;
                }
            }
        }
        return answer;
    }

    class print {
        int prior;
        int idx;

        public print(int prior, int idx) {
            this.prior = prior;
            this.idx = idx;
        }
    }
}