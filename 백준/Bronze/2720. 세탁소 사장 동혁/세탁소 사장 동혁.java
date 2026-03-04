import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int money = Integer.parseInt(br.readLine());
            int quarter = 0;
            int dime = 0;
            int nickel = 0;
            int penny = 0;

            if (money / 25 >= 0) {
                quarter = money / 25;
                money = money % 25;
            } else {
                quarter = 0;
            }
            if (money / 10 >= 0) {
                dime = money / 10;
                money = money % 10;
            } else {
                dime = 0;
            }
            if (money / 5 >= 0) {
                nickel = money / 5;
                money = money % 5;
            } else {
                nickel = 0;
            }
            if (money / 1 >= 0) {
                penny = money / 1;
                money = money % 1;
            } else {
                penny = 0;
            }
            sb.append(quarter).append(" ").append(dime).append(" ")
                    .append(nickel).append(" ").append(penny).append('\n');
        }
        System.out.print(sb);
    }
}
