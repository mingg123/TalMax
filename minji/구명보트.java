import java.util.*;

class 구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int idx = 0;
        for (int i = people.length - 1; idx <= i; i--) {
            if (people[idx] + people[i] <= limit) {
                idx++;
            }
            answer++;
        }
        return answer;
    }
}