import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Number1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double result = 0;

        ArrayList<Integer> arrNum = new ArrayList<>();

        for (int i=0; i<n; i++) {
            int a = sc.nextInt();
            arrNum.add(a);
        }

        for (Integer num : arrNum) {
            result += ((double) num / (double) Collections.max(arrNum)) * 100;
        }
        System.out.println((double) result / (double) n);

    }
}
