import java.util.Scanner;

public class string19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();

        if (txt.contains(".")) System.out.println(2);
        else if (Character.isDigit(txt.charAt(0))) System.out.println(1);
        else System.out.println(0);








    }
}
