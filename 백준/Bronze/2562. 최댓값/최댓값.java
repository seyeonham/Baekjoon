import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int count = 0;

        for (int i = 0; i < 9; i++) {
            int value = Integer.parseInt(br.readLine());
            if (value > max) {
                max = value;
                count = i + 1;
            }
        }

        br.close();
        System.out.println(max);
        System.out.println(count);
    }
}
