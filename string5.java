import java.util.Scanner;

public class string5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

       for (int i = 0; i < n; i++) {
            System.out.print((char) ('z'-i)+" ");
        }
    }
}
