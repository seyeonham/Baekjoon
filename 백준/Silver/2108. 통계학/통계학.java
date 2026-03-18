import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            sum += num;
        }

        double average = (double) sum / n;
        int avg = (int)Math.round(average);

        Arrays.sort(arr);

        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(num));
        }

        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) {
                modes.add(entry.getKey());
            }
        }

        Collections.sort(modes);

        int result;
        if (modes.size() > 1) {
            result = modes.get(1);
        } else {
            result = modes.get(0);
        }

        sb.append(avg).append('\n');
        sb.append(arr[n / 2]).append('\n');
        sb.append(result).append('\n');
        sb.append(arr[n - 1] - arr[0]);

        System.out.print(sb);
    }
}
