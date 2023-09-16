import java.util.Scanner;

public class string15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) > 'а' && str.charAt(i) < 'я'){
                count++;
            }
        }
        System.out.println(count);

    }
}
