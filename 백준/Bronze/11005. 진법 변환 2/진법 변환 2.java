import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            if (num % n >= 10) {
                sb.append((char)(num % n + 'A' - 10));
            } else {
                sb.append(num % n);
            }
            num = num / n;
        }

        System.out.print(sb.reverse());
    }
}
