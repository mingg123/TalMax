package minji.구현;

//Codility
public class MinAvgTwoSlice {
    public int solution(int[] A) {
        float minAvg = (A[0] + A[1]) / 2f;
        int minIdx = 0;
        for (int i = 2; i < A.length; i++) {
            float avg = (A[i] + A[i - 1] + A[i - 2]) / 3f;
            if (minAvg > avg) {
                minAvg = avg;
                minIdx = i - 2;
            }
            avg = (A[i] + A[i - 1]) / 2f;
            if (minAvg > avg) {
                minAvg = avg;
                minIdx = i - 1;
            }
        }
        return minIdx;
    }
}
