package minji.스택;

import java.util.*;
import java.util.Scanner;

// Map을 사용할경우 시간초과나서 배열로 사용함. 빈도수 측정하는 부분
public class 오등큰수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] temp = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int[] count = new int[1000001];
        for (int i = 0; i < N; i++) {
            temp[i] = sc.nextInt();
            count[temp[i]]++;
            // map.put(temp[i], map.getOrDefault(temp[i], 0) + 1);
        }
        for (int i = 0; i < N; i++) {
            while (!st.empty() && count[temp[st.peek()]] < count[temp[i]]) {
                temp[st.pop()] = temp[i];
            }
            st.push(i);
        }
        while (!st.empty()) {
            temp[st.pop()] = -1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(temp[i]).append(" ");

        }
        System.out.print(sb.toString());
    }
}