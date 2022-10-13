package minji.스택;
import java.nio.file.NotLinkException;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class 스택20221014 {   
    public static ArrayList<Integer>[] map;
    public static int N;
    public static int M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i <= N; i++){
        String input = sc.nextLine();
        switch(input.split(" ")[0]) {
            case "push":
                s.push(Integer.parseInt(input.split(" ")[1]));
            break;
            case "top":
                if(s.isEmpty()) sb.append(-1);
                else sb.append(s.peek());
                sb.append("\n");
            break;
            case "size":
                sb.append(s.size());
                sb.append("\n");
            break;
            case "empty":
                if(!s.isEmpty()) sb.append(0);
                else sb.append(1);
                sb.append("\n");
            break;
            case "pop":
                if(!s.isEmpty()) sb.append(s.pop());
                else sb.append(-1);
                sb.append("\n");
            break;
            }
        }
        System.out.println(sb.toString()); 
    } 
}

