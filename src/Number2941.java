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

        }


}
