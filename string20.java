import java.util.Scanner;

public class string20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();

        for (int i = 0; i < txt.length(); i++) {
            System.out.println(txt.charAt(i));
        }


    }
}
