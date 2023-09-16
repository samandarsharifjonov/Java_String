import java.util.Scanner;

public class string38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();
        System.out.println(s1.replaceAll(s2, s3));
    }
}

