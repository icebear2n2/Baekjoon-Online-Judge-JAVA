import java.util.Scanner;

public class Number11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String num = sc.nextLine();
        int sum = 0;

        String[] numbers = num.split("");

        for (int i=0; i<numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);
        }
        System.out.println(sum);
    }
}
