package minji.큐;

import java.io.IOException;
import java.util.*;
class 요세푸드20221029 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int target = sc.nextInt();

        ArrayList <Integer> arr = new ArrayList<>();
        for(int i = 1; i <= N; i++) {
            arr.add(i);
        }

        ArrayList<String> ans = new ArrayList<>();
        int index = target-1;

        while(arr.size() > 0) {
            ans.add(Integer.toString(arr.get(index)));
            arr.remove(index);
            if(arr.size() > 0) {
                index = (index -1 +target);
                if(index != 0) index = index % arr.size();
            }
        }
        sb.append("<");
        for(int i = 0; i < ans.size(); i++) {
            sb.append(ans.get(i));
            if(i != ans.size()-1) {
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb.toString());
    }
}



