package minji.구현;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int temp = Y - X;
        int result = 0;
        if (temp % D == 0) {
            result = temp / D;
        } else {
            result = (temp / D) + 1;
        }
        return result;
    }
}
