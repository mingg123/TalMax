package minji.큐;
import java.util.*;

public class 큐 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Deque <Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            String temp = sc.next();
            if(temp.equals("push")) {
                int num = sc.nextInt();
                q.addLast(num);
            } else if(temp.equals("front")) {
                if(q.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(q.peekFirst()).append("\n");
                }
            } else if(temp.equals("back")) {
                if(q.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(q.peekLast()).append("\n");
                }
            } else if(temp.equals("size")) {
                sb.append(q.size()).append(("\n"));
            } else if(temp.equals("empty")) {
                if(q.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else {
                if(q.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(q.pollFirst()).append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
  
}
