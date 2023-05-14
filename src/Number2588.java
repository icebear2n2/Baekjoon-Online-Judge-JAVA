import java.util.ArrayList;
import java.util.Scanner;

public class Number2588 {
    public static void main(String[] args) {
        int a, b;
        int num;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        num = a * b;

        ArrayList<Integer> arrNum = new ArrayList<>();
        while(b > 0) {
            arrNum.add(a * (b % 10));
            b /= 10;
        }
        arrNum.add(num);

        for (int i:arrNum) {
            System.out.println(i);
        }
    }
}
