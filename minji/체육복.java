package minji;

import java.util.*;

class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        ArrayList<Integer> lostStudent = new ArrayList<>();
        ArrayList<Integer> reserveStudent = new ArrayList<>();
        for (int i = 0; i < lost.length; i++) {
            lostStudent.add(lost[i]);
        }
        for (int i = 0; i < reserve.length; i++) {
            reserveStudent.add(reserve[i]);
        }
        Collections.sort(reserveStudent);
        Collections.sort(lostStudent);

        for (int i = 1; i <= n; i++) {
            if (lostStudent.contains(i) && reserveStudent.contains(i)) {
                answer++;
                lostStudent.remove(lostStudent.indexOf(i));
                reserveStudent.remove(reserveStudent.indexOf(i));
            }
        }

        while (!reserveStudent.isEmpty()) {
            int target = reserveStudent.remove(0);
            if (lostStudent.contains(target - 1)) {
                lostStudent.remove(lostStudent.indexOf(target - 1));
                answer++;
            } else if (lostStudent.contains(target + 1)) {
                lostStudent.remove(lostStudent.indexOf(target + 1));
                answer++;
            }
        }
        return answer;
    }
}