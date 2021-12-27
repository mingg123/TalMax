package minji.스택;

import java.rmi.ConnectIOException;
import java.util.*;

public class 에디터 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.next();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < temp.length(); i++) {
            arr.add(Character.toString(temp.charAt(i)));
        }
        int index = temp.length();
        sc.nextLine();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String dir = sc.next();
            if (dir.equals("P")) {
                String newstr = sc.next();
                // if (index != 0) {
                // arr.add(index - 1, newstr);
                // } else {
                // arr.add(index, newstr);
                // }
                System.out.println("P일경우 " + newstr + " " + index);
                arr.add(index, newstr);
                if (index == arr.size() - 1)
                    index++;
                // else
                // index++;

            } else {
                if (dir.equals("D")) {
                    if (index == arr.size() - 1)
                        index++;
                    // else
                    // index++;
                } else if (dir.equals("L")) { // L일경우
                    if (index <= 0) {
                        continue;
                    } else {
                        index--;
                    }
                } else { // B일 경우
                    if (index <= 0) {
                        continue;
                    } else {
                        arr.remove(index);
                    }
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
        }
        System.out.println(" ");
        System.out.println("index " + index);

    }
}
