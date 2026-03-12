import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int a2 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());

        int lcm = b1 * b2 / gcd(b1, b2);
        a1 = a1 * (lcm / b1);
        a2 = a2 * (lcm / b2);

        int a = a1 + a2;
        int b = lcm;
        int gcd = gcd(a, b);

        a = a / gcd;
        b = b / gcd;

        System.out.print(a + " " + b);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
