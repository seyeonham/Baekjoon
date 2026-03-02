import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            sb.append(word.charAt(0)).append(word.charAt(word.length() - 1)).append('\n');
        }

        br.close();
        System.out.print(sb);
    }
}
