import java.util.Scanner;

public class String14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if ( str.charAt(i) >= 'A'&& str.charAt(i) <= 'Z'){
                count++;
            }
        }

        System.out.println(count);
    }
}
