package minji.스택;

import java.util.*;
public class 덱 {
  public  static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Deque<Integer> deq = new ArrayDeque<>();
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < N; i++) {
      String command = sc.next();
      switch(command) {
        case "push_back" :
        int num = sc.nextInt();
        deq.addLast(num);
        break;

        case "push_front" :
        num = sc.nextInt();
        deq.addFirst(num);
        break;

        case "pop_front" :
        if(deq.isEmpty()) {
          // System.out.println(-1);
          sb.append(-1).append("\n");
        } else {
          // System.out.println(deq.pollFirst());
          sb.append(deq.pollFirst()).append("\n");
        }
        break;

        case "pop_back" :
        if(deq.isEmpty()) {
          // System.out.println(-1);
          sb.append(-1).append("\n");
        } else {
          // System.out.println(deq.pollLast());
          sb.append(deq.pollLast()).append("\n");
        }
        break;

        case "size" :
        // System.out.println(deq.size());
        sb.append(deq.size()).append("\n");
        break;

        case "empty" :
        // System.out.println(deq.isEmpty() ? 1 : 0);
        sb.append(deq.isEmpty() ? 1 : 0).append("\n");
        break;

        case "front" :
        // System.out.println(deq.isEmpty()? -1 : deq.peekFirst());
        sb.append(deq.isEmpty()? -1 : deq.peekFirst()).append("\n");
        break;

        case "back" :
        // System.out.println(deq.isEmpty()? -1 : deq.peekLast());
        sb.append(deq.isEmpty()? -1 : deq.peekLast()).append("\n");
        break;
      }

    }
    System.out.print(sb.toString());
  }
}
