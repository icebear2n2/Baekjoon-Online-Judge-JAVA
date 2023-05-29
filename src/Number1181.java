import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Number1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.next();
        }

        HashSet<String> hashSet = new HashSet<>(Arrays.asList(arr));
        String[] resultArr = hashSet.toArray(new String[0]);

        Arrays.sort(resultArr);
        Arrays.sort(resultArr, Comparator.comparing(String::length));

        for (String str : Arrays.asList(resultArr)) {
            System.out.println(str);
        }
    }
}
