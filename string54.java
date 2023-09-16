import java.util.Scanner;

public class string54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < line.length(); i++) {
            if ('A'<=line.charAt(i) && line.charAt(i)<='Z' ) count++;
        }
        System.out.println(count);
    }
}
