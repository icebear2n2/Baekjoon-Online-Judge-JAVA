import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Number10818 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arrNum = new ArrayList<>();

        for (int i=0; i<n; i++) {
            int a = sc.nextInt();
            arrNum.add(a);
        }
        System.out.println(Collections.min(arrNum) + " " + Collections.max(arrNum));
    }
}
