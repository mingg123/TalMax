package minji.수학;

import java.util.*;
import java.util.Scanner;

public class BaseConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int N = sc.nextInt();

        int demical = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = N - 1; i >= 0; i--) {
            int num = sc.nextInt();
            int multi = (int) Math.pow(start, i);
            demical += (num * multi);
        }

        while (demical != 0) {
            st.push(demical % end);
            demical = demical / end;
        }

        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }

    }
}