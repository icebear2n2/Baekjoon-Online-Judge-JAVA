import java.util.ArrayList;
import java.util.Scanner;

public class Number25314 {
    public static void main(String[] args) {
        int n;
        ArrayList<String> arrNum = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i=0; i<(n / 4); i++) {
            System.out.print("long ");
        }
        System.out.print("int");


    }
}
