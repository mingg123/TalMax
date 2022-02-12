package minji.스택;

import java.rmi.ConnectIOException;
import java.util.*;

import java.util.*;

//시간초과
public class 에디터 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.next();
        ArrayList<Character> arr = new ArrayList<>();
        for(int i = 0; i < temp.length(); i++) {
            arr.add(temp.charAt(i));
        }
        int N = sc.nextInt();
        sc.nextLine();
        int loc = temp.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            String dir  = sc.nextLine();
            if(dir.charAt(0) == 'P') {
                arr.add(loc, dir.charAt(2));
                loc++;
            }
            else if(dir.charAt(0) == 'L') {
                if(loc > 0) {
                    loc--;
                }
            }
            else if(dir.charAt(0) == 'D') {
                if(loc < arr.size()) {
                    loc++;
                }
            }
            else {
                if(loc > 0) {
                    arr.remove(loc-1);
                    loc--;
                }
            }
        }
        for(int i = 0; i < arr.size(); i++) {
            sb.append(arr.get(i));
        }
        System.out.println(sb.toString());
    }
  
}

