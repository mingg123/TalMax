package minji.큐;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
class 큐20221024 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        Deque<Integer> queue = new LinkedList<>();
        sc.nextLine();
        for(int i = 0; i < N; i++) {
            String command = sc.nextLine();
            String[] token = command.split(" ");
            switch(token[0]) {
                case "push":
                    queue.addLast(Integer.parseInt((token[1])));
                break;
                case "front":
                    if(queue.isEmpty()) sb.append(-1);
                    else sb.append(queue.peekFirst());
                    sb.append("\n");
                break;
                case "back":
                    if(queue.isEmpty()) sb.append(-1);
                    else sb.append(queue.peekLast());
                    sb.append("\n");
                break;
                case "size":
                    sb.append(queue.size());
                    sb.append("\n");
                break;
                case "empty":
                    if(queue.isEmpty()) sb.append(1);
                    else sb.append(0);
                    sb.append("\n");
                break;
                case "pop":
                    if(queue.isEmpty()) sb.append(-1);
                    else sb.append(queue.pollFirst());
                    sb.append("\n");
                break;
            }
        }
        System.out.println(sb.toString());
    }
}



