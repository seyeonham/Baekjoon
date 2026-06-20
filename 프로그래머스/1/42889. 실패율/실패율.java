import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        double[] rate = new double[N];
        
        for (int i = 1; i <= N; i++) {
            int reach = 0;
            int fail = 0;
        
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i) {
                    fail++;
                }
                if (stages[j] >= i) {
                    reach++;
                }
            }
            
            rate[i - 1] = reach == 0 ? 0 : (double) fail / reach;
        }
        
        Integer[] stage = new Integer[N];

        for (int i = 0; i < N; i++) {
            stage[i] = i + 1;
        }

        Arrays.sort(stage, (a, b) -> {
            if (rate[b - 1] > rate[a - 1]) return 1;
            if (rate[b - 1] < rate[a - 1]) return -1;
            return a - b;
        });

        return Arrays.stream(stage)
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}