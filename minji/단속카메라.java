package minji;

import java.util.*;

class 단속카메라 {
    public int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                Integer a = o1[1];
                Integer b = o2[1];
                return a.compareTo(b);
            }
        });

        int cam = Integer.MIN_VALUE;

        for (int i = 0; i < routes.length; i++) {
            if (cam < routes[i][0]) {
                cam = routes[i][1];
                answer++;
            }
        }
        return answer;
    }
}