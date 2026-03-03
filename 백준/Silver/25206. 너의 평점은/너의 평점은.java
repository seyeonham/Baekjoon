import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double sum = 0;
        double num = 0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double grade = Double.parseDouble(st.nextToken());
            String score = st.nextToken();

            if (score.equals("P")) {
                continue;
            }

            switch (score) {
                case "A+" :
                    sum += grade * 4.5;
                    num += grade;
                    break;
                case "A0" :
                    sum += grade * 4.0;
                    num += grade;
                    break;
                case "B+" :
                    sum += grade * 3.5;
                    num += grade;
                    break;
                case "B0" :
                    sum += grade * 3.0;
                    num += grade;
                    break;
                case "C+" :
                    sum += grade * 2.5;
                    num += grade;
                    break;
                case "C0" :
                    sum += grade * 2.0;
                    num += grade;
                    break;
                case "D+" :
                    sum += grade * 1.5;
                    num += grade;
                    break;
                case "D0" :
                    sum += grade * 1.0;
                    num += grade;
                    break;
                case "F" :
                    sum += grade * 0;
                    num += grade;
                    break;
            }
        }
        System.out.print(sum / num);
    }
}
