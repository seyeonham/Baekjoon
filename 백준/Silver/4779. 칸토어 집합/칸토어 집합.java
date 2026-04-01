import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while ((input = br.readLine()) != null) {
            if (input.isEmpty()) break;

            int n = Integer.parseInt(input);
            int len = (int) Math.pow(3, n);

            sb = new StringBuilder();

            cantor(len);

            System.out.println(sb.toString());
        }
    }

    public static void cantor(int len) {
        if (len == 1) {
            sb.append("-");
            return;
        }

        int newLen = len / 3;
        cantor(newLen);

        for (int i = 0; i < newLen; i++) {
            sb.append(" ");
        }

        cantor(newLen);
    }
}
