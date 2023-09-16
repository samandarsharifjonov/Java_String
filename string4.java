import java.util.Scanner;

public class string4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        /*for (char i = 'A'; i < 'Z'; i++) {
            System.out.println(i+" => "+(int)(i));
        }*/

        for (char i = 0; i < n; i++) {
            System.out.print((char) ('A'+i)+" ");
        }
    }
}
