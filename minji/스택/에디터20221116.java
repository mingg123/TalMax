package minji.스택;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
class 에디터20221116 {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // String str = sc.nextLine();
        String str = reader.readLine();
        Stack <String> leftst = new Stack<>();
        Stack <String> rightst = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            leftst.push(Character.toString(str.charAt(i)));
        }
        // int N = sc.nextInt();
        int N = Integer.parseInt(reader.readLine());
        // sc.nextLine();
        for(int i = 0; i < N; i++) {
            // String command = sc.nextLine();
            String command = reader.readLine();
            if(command.charAt(0) == 'P') {
                leftst.push(Character.toString(command.charAt(2)));
            } else if(command.charAt(0) == 'L') {
                if(!leftst.isEmpty()) {
                    rightst.push(leftst.pop());
                }
            } else if(command.charAt(0) == 'D') {
                if(!rightst.isEmpty()) {
                    leftst.push(rightst.pop());
                }
            } else {
                if(!leftst.isEmpty()) {
                    leftst.pop();
                }
            }
        }
        while(!leftst.isEmpty()) {
            // leftStr += leftst.pop();
            rightst.push(leftst.pop());
        }
        while(!rightst.isEmpty()) {
            // rightStr+= rightst.pop();
            bw.write(rightst.pop());
        }
        bw.flush();
		    bw.close(); 
        // System.out.print(new StringBuffer(leftStr).reverse().toString());
        // System.out.println(new StringBuffer(rightStr).toString());
    }
}



