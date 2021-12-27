package minji.큐;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 요세푸스 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int start = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Integer> queue = new LinkedList();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        int count = 1;
        while (!queue.isEmpty()) {
            if (count == start) {
                arr.add(queue.poll());
                count = 1;
            } else {
                queue.add(queue.poll());
                count++;
            }
        }
        System.out.print("<");
        for (int i = 0; i < arr.size(); i++) {

            if (i == arr.size() - 1) {
                System.out.print(arr.get(i) + ", ");
            } else {
                System.out.print(arr.get(i) + ", ");
            }
        }
        System.out.print(">");
    }
}
