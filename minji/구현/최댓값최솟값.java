import java.util.*;
class 최댓값최솟값 {
    public String solution(String s) {
        String [] temp = s.split(" ");
        String answer = "";
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < temp.length; i++) {
            arr.add(Integer.parseInt(temp[i]));
        }
        Collections.sort(arr);
        answer = arr.get(0) + " " + arr.get(arr.size()-1);
        return answer;
    }
}