import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(br.readLine());

            if (num <= 2) {
                sb.append(2).append('\n');
                continue;
            }

            long target = num;
            while (true) {
                if (isPrime(target)) {
                    sb.append(target).append('\n');
                    break;
                }
                target++;
            }
        }
        System.out.print(sb);
    }

    public static boolean isPrime(long num) {
        if (num < 2) return false;

        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
