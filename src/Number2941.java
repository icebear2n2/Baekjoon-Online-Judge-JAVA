import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Number2941 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>() {{
            put("č", "c=");
            put("ć", "c-");
            put("dž", "dz=");
            put("đ", "d-");
            put("lj", "lj");
            put("nj", "nj");
            put("š", "s=");
            put("ž", "z=");
        }};
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;

        for (String value : (map).values()) {
            if (str.contains(value)) {
                str = str.replace(value, "1");
            }
        }
        String[] str2 = str.split("");
        for (String s : str2) {
            count += 1;
        }
        System.out.println(count);
    }


}
