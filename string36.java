import java.util.Scanner;

public class string36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();

       String result = s1.replaceFirst(s2,s3);
       System.out.println(result);
    }
}
