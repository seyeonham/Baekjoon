import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.length() >= k) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }

        List<String> words = new ArrayList<>(map.keySet());

        Collections.sort(words, (s1, s2) -> {
            int count1 = map.get(s1);
            int count2 = map.get(s2);
            if (count1 != count2) {
                return count2 - count1;
            }

            if (s1.length() != s2.length()) {
                return s2.length() - s1.length();
            }

            return s1.compareTo(s2);
        });

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append('\n');
        }
        System.out.print(sb);

    }
}
