import java.util.*;

public class Number2480 {
    public static void main(String[] args) {
        // 같은 눈 3개 = 10000 + (같은눈) * 1000
        // 같은 눈 2개 1000 + (같은눈) * 100
        // (가장 큰 눈) * 100


        int a, b, c;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        ArrayList<Integer> arrNum = new ArrayList<>(Arrays.asList(a, b, c));

        Set<Integer> set = new HashSet<>(arrNum);

        if (set.size() == 3) {
            System.out.println(Collections.max(set) * 100);
        } else {
            for (int i : set) {
                if (Collections.frequency(arrNum, i) == 3) {
                    System.out.println(10000 + (i * 1000));
                }
                else if (Collections.frequency(arrNum, i) == 2) {
                    System.out.println(1000 + (i * 100));
                }
            }
        }

    }
}
