import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String word = st.nextToken();

            for (int j = 0; j < word.length(); j++) {
               sb.append(String.valueOf(word.charAt(j)).repeat(num));
            }

            sb.append('\n');
        }

        br.close();
        System.out.println(sb);
    }
}
