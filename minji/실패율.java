package minji;

import java.util.*;

class 실패율 {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i;
        }

        int count[] = new int[N + 1];
        double failures[] = new double[N + 1];
        for (int i = 0; i < stages.length; i++) {
            count[stages[i] - 1]++;
        }

        int sum = stages.length;
        for (int i = 0; i < count.length; i++) {
            if (sum == 0)
                failures[i] = 0.0;
            else {
                failures[i] = count[i] / (double) sum;
                sum = sum - count[i];
            }
        }
        // Default는 내림차순. 실패확률이 같을경우에는 오름차순
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (failures[o1] < failures[o2]) {
                    return 1;
                } else if (failures[o1] == failures[o2]) {
                    if (o1 > o2)
                        return 1;
                }
                return -1;
            }
        });
        answer = new int[N];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[i] + 1;
        }
        return answer;
    }
}