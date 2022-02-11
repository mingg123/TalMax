package minji.구현;

//정확도는 100, 효율성은 0
public class MaxNonoverlappingSegments {
    public static int N;
    public static int count;
    public static void sol(int idx, int []A, int [] B, String temp, int cnt) {
        count = Math.max(count, cnt);
        // System.out.println(temp);
        for(int i = idx+1; i < N; i++) {
            if(A[i] > B[idx]) {
                sol(i, A, B, temp+Integer.toString(i), cnt+1);
            }
        }
    }
    public int solution(int[] A, int[] B) {
        N = A.length;
        count = 0;
        for(int i = 0; i <  A.length; i++) {
            sol(i, A, B, Integer.toString(i), 1);
        }
        return count;
    }
}

