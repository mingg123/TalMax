package minji;

import java.util.*;

class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            int idx = commands[i][2] - 1;
            for (int j = start; j <= end; j++) {
                arr.add(array[j]);
            }
            Collections.sort(arr);
            answer[i] = arr.get(idx);
        }
        return answer;
    }
}