import java.util.Scanner;

public class Number2884 {
    public static void main(String[] args) {
        int h, m;
        int total;
        Scanner sc = new Scanner(System.in);

        h = sc.nextInt();
        m = sc.nextInt();

        if (m < 45) {
            h -= 1;
            m += 15;
            if (h == -1) {
                h = 23;
            }
        } else {
            m -= 45;
        }
        System.out.println(h + " " + m);
    }
}
