import java.util.Scanner;

public class Number2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i=1; i<t+1; i++) {
            String result = "*".repeat(i);
            System.out.println(result);
        }
    }
}
