package minji.구현;

//Codility
public class TapeEquilibrium {
    public int solution(int[] A) {
        int[] front = new int[A.length - 1];
        int[] back = new int[A.length - 1];
        front[0] = A[0];
        back[back.length - 1] = A[A.length - 1];
        for (int i = 1; i < front.length; i++) {
            front[i] = front[i - 1] + A[i];
        }
        for (int i = back.length - 2; i >= 0; i--) {
            back[i] = back[i + 1] + A[i + 1];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < front.length; i++) {

            min = Math.min(min, Math.abs(front[i] - back[i]));
        }
        return min;
    }
}
