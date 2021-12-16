package minji;

import java.util.*;

class 소수찾기 {
    public static boolean[] visit;
    public static HashSet<String> set;

    public int solution(String numbers) {
        int answer = 0;
        set = new HashSet<>();
        String[] num = new String[numbers.length()];
        visit = new boolean[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            num[i] = Character.toString(numbers.charAt(i));
        }
        for (int i = 1; i <= numbers.length(); i++) {
            ans(num, 0, i, "");
        }
        return set.size();
    }

    public void ans(String[] num, int index, int r, String s) {
        if (r == index) {
            checkisPrime(s);
        } else {
            for (int i = 0; i < num.length; i++) {
                if (!visit[i]) {
                    visit[i] = true;
                    ans(num, index + 1, r, s + num[i]);
                    visit[i] = false;
                }
            }
        }
    }

    public void checkisPrime(String s) {
        if (s.charAt(0) != '0' && !s.equals("1")) {
            int target = Integer.parseInt(s);
            boolean isPrime = false;
            for (int i = 2; i < target; i++) {
                if (target % i == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime) {
                set.add(s);
            }
        }
    }
}