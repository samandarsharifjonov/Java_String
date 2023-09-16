import java.util.Scanner;

public class string25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = Integer.parseInt(str);
        String sum = " ";

        while (n > 0) {
            sum += n % 2;
             n /= 2;
        }

        for (int i = sum.length()-1; i >= 0; i--) {
            System.out.print(sum.charAt(i));
        }

    }
}
