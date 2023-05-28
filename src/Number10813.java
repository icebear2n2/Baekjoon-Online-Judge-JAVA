import java.util.ArrayList;
import java.util.Scanner;

public class Number10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrNum = new ArrayList<>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int x=1; x<n+1; x++) {
            arrNum.add(x);
        }

        for (int x=0; x<m; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int num = arrNum.get(i-1);
            int num2 = arrNum.get(j-1);

            arrNum.remove(i-1);
            arrNum.add(i-1, num2);
            arrNum.remove(j-1);
            arrNum.add(j-1, num);
        }
        for (Integer num : arrNum) {
            System.out.print(num + " ");
        }
    }
}
