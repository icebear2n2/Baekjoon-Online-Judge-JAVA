import java.util.ArrayList;
import java.util.Scanner;

public class Number10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrNum = new ArrayList<>();
        int n = sc.nextInt();
        int x = sc.nextInt();

        for (int i=0; i<n; i++) {
            int a = sc.nextInt();
            arrNum.add(a);
        }
        for (int i : arrNum) {
            if (i<x) {
                System.out.print(i + " ");
            }
        }
    }
}
