import java.util.Scanner;

public class Number2525 {
    public static void main(String[] args) {
        int a, b;
        int c;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ((b+c) > 59) {
            a += (b+c) / 60;
            b = (b+c) % 60;

            if (a > 23) {
                a -= 24;
            }
        } else {
            b += c;
        }

        System.out.println(a + " " + b);
    }
}
