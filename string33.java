import java.util.Scanner;

public class string33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt1 = scanner.nextLine();
        String txt2 = scanner.nextLine();
        System.out.println(txt1.replaceAll(txt2,""));
    }
}
