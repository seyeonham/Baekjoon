import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] arr = new String[n];
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            arr[i - 1] = name;
            map.put(name, i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String s = br.readLine();

            if (Character.isDigit(s.charAt(0))) {
                int num = Integer.parseInt(s);
                sb.append(arr[num - 1]).append('\n');
            } else {
                sb.append(map.get(s)).append('\n');
            }
        }

        System.out.print(sb);
    }
}
