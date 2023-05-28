import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Number3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrNum = new ArrayList<>();

        for (int i=0; i<10; i++) {
            int n = sc.nextInt();
            arrNum.add(n % 42);
        }

        Set<Integer> set = new HashSet<>(arrNum);
        System.out.println(set.size());
    }
}
