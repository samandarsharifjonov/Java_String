import java.util.Scanner;

public class string41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int sum = 1;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' '){
                sum++;
            }
        }
        System.out.println(sum);

    }
}
