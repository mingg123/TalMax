package minji.구현;

import java.util.*;

class 다음큰숫자 {
    public int solution(int n) {
        int answer = 0;
        String binary = Integer.toBinaryString(n);
        int targetCount = countBinary(n);
        int target = n + 1;
        for (;;) {
            if (countBinary(target) == targetCount) {
                answer = target;
                break;
            } else {
                target++;
            }
        }
        return answer;
    }

    public static int countBinary(int target) {
        int count = 0;
        String temp = Integer.toBinaryString(target);
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}