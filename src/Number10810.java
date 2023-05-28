import java.util.ArrayList;
import java.util.Scanner;

public class Number10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arrNum = new ArrayList<>();
        for (int i=1; i<n+1; i++) {
            arrNum.add(0);
        }
        for (int x=0; x<m; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int a=i-1; a<=(j-1); a++) {
                arrNum.remove(a);
                arrNum.add(a, k);
            }
        }
        for(Integer num : arrNum) {
            System.out.print(num + " ");
        }
    }
}
