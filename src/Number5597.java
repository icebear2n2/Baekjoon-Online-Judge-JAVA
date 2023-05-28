import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Number5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> oldList = new ArrayList<>();
        ArrayList<Integer> newList = new ArrayList<>();

        for (int i=1; i<=28; i++) {
            int n = sc.nextInt();
            newList.add(n);
        }

        for (int i=1; i<= 30; i++) {
            oldList.add(i);
        }

        List<Integer> noneMathList = oldList.stream().filter(o -> newList.stream().noneMatch(Predicate.isEqual(o))).collect(Collectors.toList());
        for (Integer num : noneMathList) {
            System.out.println(num);
        }
    }
}
