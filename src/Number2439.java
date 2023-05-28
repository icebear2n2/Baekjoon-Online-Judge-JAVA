import java.util.Scanner;

public class Number2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        for (int i=n-1; i>-1; i--) {
            count += 1;
            String result = " ".repeat(i) + "*".repeat(count);
            System.out.println(result);
        }
    }
}
