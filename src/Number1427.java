import java.util.Arrays;
import java.util.Scanner;

public class Number1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverse = "";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        str = new String(chars);

        for (int i=str.length()-1; i>=0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);


    }
}
