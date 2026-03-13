import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;

            if (n == 0) {
                break;
            }

            for (int i = n + 1; i <= 2 * n; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }

            sb.append(count).append('\n');
        }

        System.out.print(sb);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int j = 2; j * j <= n; j++) {
            if (n % j == 0) {
                return false;
            }
        }

        return true;
    }

}
