package minji;

import java.util.*;

class 모의고사 {
    public int[] solution(int[] answers) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] temp1 = { 1, 2, 3, 4, 5 };
        int[] temp2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] temp3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        ArrayList<Integer> result = new ArrayList<>();
        int max = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < answers.length; i++) {
            int token = answers[i];
            if (temp1[i % 5] == token) {
                count1++;
                if (max < count1)
                    max = count1;
            }
            if (temp2[i % 8] == token) {
                count2++;
                if (max < count2)
                    max = count2;
            }
            if (temp3[i % 10] == token) {
                count3++;
                if (max < count3)
                    max = count3;
            }
        }
        arr.add(count1);
        arr.add(count2);
        arr.add(count3);
        System.out.println(max);
        for (int i = 0; i < arr.size(); i++) {
            if (max == arr.get(i)) {
                result.add(i + 1);
            }
        }
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}