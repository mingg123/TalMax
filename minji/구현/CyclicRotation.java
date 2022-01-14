package minji.구현;

//Codility
public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int idx = (i + K) % A.length;
            B[idx] = A[i];
        }
        return B;
    }
}
