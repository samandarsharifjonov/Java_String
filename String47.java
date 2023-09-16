import java.util.Scanner;

public class String47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] array = line.split(" ");
        String result ="";

        for (int i = 0; i < array.length; i++) {
            result = line.replaceAll(" ", ".");
        }

        System.out.println(result);
    }
}
