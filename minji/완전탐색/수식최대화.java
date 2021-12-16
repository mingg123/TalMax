package minji.완전탐색;

import java.util.*;

class 수식최대화 {
    public static ArrayList<String> operList;
    public static ArrayList<Long> numList;
    public static String[] oper = { "-", "+", "*" };
    public static boolean[] visit;
    public static String[] output;
    public static long answer;

    public long solution(String expression) {
        operList = new ArrayList<>();
        numList = new ArrayList<>();
        visit = new boolean[3];
        output = new String[3];
        String num = "";
        for (int i = 0; i < expression.length(); i++) {
            Character token = expression.charAt(i);
            if (token == '-' || token == '*' || token == '+') {
                operList.add(token.toString());
                numList.add(Long.parseLong(num));
                num = "";
            } else {
                num = num + token.toString();
            }
        }
        numList.add(Long.parseLong(num));
        priorityOper(0, 3);
        return answer;
    }

    public void priorityOper(int depth, int r) {
        if (depth == r) {
            solve();
            return;
        }
        for (int i = 0; i < oper.length; i++) {
            if (!visit[i]) {
                visit[i] = true;
                output[depth] = oper[i];
                priorityOper(depth + 1, r);
                visit[i] = false;

            }
        }
    }

    public void solve() {
        ArrayList<String> oper = new ArrayList<>(operList);
        ArrayList<Long> num = new ArrayList<>(numList);
        // 우선순위는 정해졌고
        for (int i = 0; i < output.length; i++) {
            String token = output[i];
            for (int j = 0; j < oper.size(); j++) {
                if (oper.get(j).equals(token)) {
                    long n1 = num.get(j);
                    long n2 = num.get(j + 1);
                    long res = cal(n1, n2, token);
                    num.remove(j + 1);
                    num.remove(j);
                    oper.remove(j);

                    num.add(j, res);
                    j--;
                }
            }
        }
        answer = Math.max(answer, Math.abs(num.get(0)));
    }

    public Long cal(Long n1, Long n2, String token) {
        if (token.equals("+")) {
            return n1 + n2;
        } else if (token.equals("-")) {
            return n1 - n2;
        } else {
            return n1 * n2;
        }
    }
}