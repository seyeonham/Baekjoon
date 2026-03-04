import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1;
        String result;

        while (n - count > 0) {
            n = n - count;
            count++;
        }

        if (count % 2 == 0) {
            result = n + "/" + (count + 1 - n);
        } else {
            result = (count + 1 - n) + "/" + n;
        }

        System.out.print(result);
    }
}
