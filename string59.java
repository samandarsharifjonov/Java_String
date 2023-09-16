import java.util.Scanner;

public class string59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int lastDot = line.lastIndexOf('.');
        System.out.println(line.substring(lastDot+1, line.length()));
    }
}
