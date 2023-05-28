import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Number3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arrNum = {1, 1, 2, 2, 2, 8};
        Integer[] chess = new Integer[6];

        for (int i=0; i<arrNum.length; i++) {
            int num = sc.nextInt();
            if (num > arrNum[i] || num < arrNum[i]) {
                arrNum[i] -= num;
            } else {
                arrNum[i] = 0;
            }
        }

        for (int arr : arrNum) System.out.print(arr + " ");
    }
}
