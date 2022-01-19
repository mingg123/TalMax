package minji.구현;

import java.util.*;
public class StoneWall {
  public int solution(int[] H) {
    Stack<Integer> s = new Stack<>();
    int count = 0;
    for(int i = 0; i < H.length; i++) {
         while(!s.isEmpty() && s.peek() > H[i]) {
            s.pop();
        } 
        if(s.isEmpty()) {
            s.push(H[i]);
            count++;
        }
        if(s.peek() < H[i]) {
            s.push(H[i]);
            count++;
        }
      
    }
    return count;
}
}
