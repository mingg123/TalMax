package minji.큐;

import java.io.IOException;
import java.util.*;
class 덱20221029 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Deque <Integer> dq = new ArrayDeque<>();
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            String token = sc.next();
            switch(token) {
                case "push_back":
                int num = sc.nextInt();
                dq.addLast(num); 
                break;

                case "push_front":
                num = sc.nextInt();
                dq.addFirst(num);
                break;

                case "pop_front":
                if(dq.isEmpty()) sb.append(-1);
                else sb.append(dq.pollFirst());
                sb.append("\n");
                break;

                case "pop_back" :
                if(dq.isEmpty()) sb.append(-1);
                else sb.append(dq.pollLast());
                sb.append("\n");
                break;

                case "size":
                sb.append(dq.size());
                sb.append("\n");
                break;

                case "empty":
                if(dq.isEmpty()) sb.append(1);
                else sb.append(0);
                sb.append("\n");
                break;

                case "front":
                if(dq.isEmpty()) sb.append(-1);
                else sb.append(dq.peekFirst());
                sb.append("\n");
                break;

                case "back":
                if(dq.isEmpty()) sb.append(-1);
                else sb.append(dq.peekLast());
                sb.append("\n");
                break;
            }
        }
        System.out.println(sb.toString());
    }
}



