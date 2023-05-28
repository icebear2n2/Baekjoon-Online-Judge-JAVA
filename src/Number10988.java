import java.util.*;

public class Number10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverse = "";

        for (int i=str.length()-1; i>=0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse) == true) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
