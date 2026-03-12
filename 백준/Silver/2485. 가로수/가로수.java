import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] between = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            between[i] = arr[i + 1] - arr[i];
        }

        int finalGCD = between[0];
        for (int i = 1; i < between.length; i++) {
            finalGCD = gcd(finalGCD, between[i]);
        }

        int result = (arr[n - 1] - arr[0]) / finalGCD + 1;

        System.out.print(result - n);

    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
