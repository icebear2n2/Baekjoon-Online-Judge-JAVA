import java.util.Scanner;

public class Number25304 {
    public static void main(String[] args) {
        long x;
        int n, a, b;
        long result = 0;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        n = sc.nextInt();

        for (int i=0; i<n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            result += (a * b);
        }
        if (result == x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
