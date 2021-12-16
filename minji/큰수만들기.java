package minji;

import java.util.*;

class 큰수만들기 {
    public String solution(String number, int k) {
        int numLen = number.length() - k;
        int index = 0;
        int max = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numLen; i++) {
            max = 0;
            for (int j = index; j <= k + i; j++) {
                // char to integer 인데 Character.getNumericValue(number.charAt(j))쓰면 실행 초과남.
                if (max < (number.charAt(j) - '0')) {
                    max = (number.charAt(j) - '0');
                    index = j + 1;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}