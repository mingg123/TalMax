package minji.스택;

import java.util.*;
import java.util.Scanner;

public class 후위표기식2 {
    public static boolean isOper(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/') {
            return true;
        } else
            return false;
    }

    public static double caculate(double num1, double num2, char c) {
        double result = 0.00;
        switch (c) {
            case '+':
                result = num2 + num1;
                break;
            case '-':
                result = num2 - num1;
                break;
            case '*':
                result = num2 * num1;
                break;
            case '/':
                result = num2 / num1;
                break;
            default:
                break;
        }

        return (result * 100) / 100.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String temp = sc.next();
        HashMap<String, Double> map = new HashMap<>();
        for (int i = 0; i < temp.length(); i++) {
            if (!isOper(temp.charAt(i))) {
                map.put(Character.toString(temp.charAt(i)), 0.00);
            }
        }
        for (String key : map.keySet()) {
            double input = sc.nextDouble();
            map.put(key, Math.round(input * 100) / 100.0);

        }
        Stack<Double> st = new Stack<>();
        for (int i = 0; i < temp.length(); i++) {
            if (!isOper(temp.charAt(i))) {
                st.add(map.get(Character.toString(temp.charAt(i))));
            } else {
                int count = 0;
                double num1 = 0.00;
                double num2 = 0.00;
                while (!st.isEmpty() && st.size() >= 2) {
                    if (count == 2)
                        break;
                    num1 = st.pop();
                    num2 = st.pop();
                    count = count + 2;
                }
                double result = caculate((num1 * 100) / 100.0, (num2 * 100) / 100.0, temp.charAt(i));
                st.add(result);
            }
        }
        System.out.print(String.format("%.2f%n", st.pop()));
    }
}