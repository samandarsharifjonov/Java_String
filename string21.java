import java.util.Scanner;

public class string21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();

        for (int i = txt.length(); i > 0; i--) {
            System.out.println(txt.charAt(i-1));
        }
    }
}