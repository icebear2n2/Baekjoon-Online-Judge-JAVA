import java.util.Scanner;

public class Number8393 {
    public static void main(String[] args) {
        int n;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i=1; i<n+1; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
