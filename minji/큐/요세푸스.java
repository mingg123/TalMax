package minji.큐;
import java.util.Scanner;
import java.util.*;
public class 요세푸스 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int start = sc.nextInt();
    Queue <Integer> q = new LinkedList<>();
    ArrayList<Integer> arr = new ArrayList<>();
    for(int i = 1; i <=num; i++) {
      q.add(i);
    }
    int count = 1;
    while(!q.isEmpty()) {
      if(count == start) {
        arr.add(q.poll());
        count = 1;
      } else {
        q.add(q.poll());
        count++;
      }
    }
    System.out.print("<");
    for(int i = 0; i < arr.size(); i++) {
      if(i == arr.size() -1) {
        System.out.print(arr.get(i));
      }
        else {
          System.out.print(arr.get(i) + ", ");
        }
    }
    System.out.print(">");
  }
}
