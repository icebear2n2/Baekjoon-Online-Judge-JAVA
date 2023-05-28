import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Number10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arrNum = new ArrayList<>();

        for (int i=0; i<n; i++) {
            int a = sc.nextInt();
            arrNum.add(a);
        }
        int v = sc.nextInt();
        System.out.println(Collections.frequency(arrNum, v));
    }
}
