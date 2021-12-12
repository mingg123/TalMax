import java.util.*;
class 최솟값만들기
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < B.length; i++) {
            arr.add(B[i]);
        }
        Collections.sort(arr, Collections.reverseOrder());
        int answer = 0;
        for(int i = 0; i < arr.size(); i++) {
            answer = answer + A[i] * arr.get(i);
        }
        return answer;
    }
}