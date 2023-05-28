import java.util.Scanner;

public class Number2444 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i= n-1; i>0; i--) {
            for (int j=0; j<n-i; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<i*2 -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}



//        for (int i=n; i>0; i--) {
//            for (int j=1; j<i+1; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int count = 1;
//        for (int i=n-1; i>=0; i--) {
//
//                System.out.println(" ".repeat(i) + "*".repeat(count) + " ".repeat(i));
//                count += 2;
//
//                }
//                count -= 4;
//                for (int i=1; i<n; i++) {
//        System.out.println(" ".repeat(i) + "*".repeat(count) + " ".repeat(i));
//        count-=2;
//        }
//        sc.close();