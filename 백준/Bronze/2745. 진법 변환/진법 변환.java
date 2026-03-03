import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        int result = 0;
        int power = 1;

        for (int i = s.length() - 1; i >= 0; i--) {
            int num;
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                num = s.charAt(i) - 'A' + 10;
            } else {
                num = s.charAt(i) - '0';
            }

            result += (long) num * power;

            power *= n;
        }

        System.out.print(result);
    }
}
