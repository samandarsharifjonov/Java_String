import java.util.Scanner;

public class string50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        line = line.replaceAll("\\s++", " ");
        StringBuilder sb = new StringBuilder(line).reverse();
        System.out.println(line);

    }
}
