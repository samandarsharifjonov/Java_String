import java.util.Scanner;

public class string18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();

        for (int i = 0; i < txt.length(); i++) {
            char s = txt.charAt(i);

            if (Character.isUpperCase(s)){
                s = Character.toLowerCase(s);
            } else if (Character.isLowerCase(s)){
                s = Character.toUpperCase(s);
            }
            System.out.print(s);
        }

    }
}
