import java.util.Scanner;
public class String025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        int onlik = Integer.parseInt(txt);
        System.out.println(Integer.toBinaryString(onlik));
    }
}
