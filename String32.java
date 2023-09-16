import java.util.Scanner;

public class String32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt1 = scanner.nextLine();
        String txt2 = scanner.nextLine();
        // 15
        // 3
        // 6
        // 9
        System.out.println((txt1.length() - txt1.replaceAll(txt2,"").length())/txt2.length());



    }
}
