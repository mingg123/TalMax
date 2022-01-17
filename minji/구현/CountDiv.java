package minji.구현;

import java.util.*;

//codility
public class CountDiv {
    class Solution {
        public int solution(int A, int B, int K) {
            // write your code in Java SE 8
            if (A != 0 && B != 0) {
                int result = B / K;
                int check = (A - 1) / K;
                return result - check;
            } else {
                int temp = B - A;
                if (A % K == 0) {
                    return (temp / K) + 1;
                } else {
                    return (temp / K);
                }
            }
        }
    }
}

// 사람들 다른 풀이
class Solution {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        if (A == 0) {
            return B / K + 1;
        } else {
            return B / K - (A - 1) / K;
        }
    }
}
