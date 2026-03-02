import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int max = x;
        int min = x;

        for (int i = 0; i < n - 1; i++) {
            int value = Integer.parseInt(st.nextToken());
            if (value > max) {
                max = value;
            } else if (value < min) {
                min = value;
            }
        }

        br.close();
        System.out.print(min + " "+ max);
    }
}
