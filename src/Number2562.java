import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Number2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrNum = new ArrayList<>();

        for (int i=0; i<9; i++) {
            int a = sc.nextInt();
            arrNum.add(a);
        }
        System.out.println(Collections.max(arrNum));
        System.out.println(arrNum.indexOf(Collections.max((arrNum))) + 1);
    }
}
