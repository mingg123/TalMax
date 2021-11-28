import java.util.*;

class 가장큰수 {
    public String solution(int[] numbers) {
        String answer = "";
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            arr.add(Integer.toString(numbers[i]));
        }
        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.size(); i++) {
            sb.append(arr.get(i));
        }
        answer = sb.toString();
        return answer.charAt(0) == '0' ? "0" : answer;
    }
}