import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] x = new int[3];
        int[] y = new int[3];

        int a = 0;
        int b = 0;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        if (x[0] == x[1]) {
            a = x[2];
        } else if (x[1] == x[2]) {
            a = x[0];
        } else {
            a = x[1];
        }

        if (y[0] == y[1]) {
            b = y[2];
        } else if (y[1] == y[2]) {
            b = y[0];
        } else {
            b = y[1];
        }

        System.out.print(a + " " + b);
    }
}
