import java.util.Scanner;

public class string8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char s = scanner.next().charAt(0);
        String result = "";
        for (int i = 0; i < n; i++) {
            result+=s;
        }
        System.out.println(result);
    }
}
