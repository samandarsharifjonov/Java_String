import javax.swing.text.AttributeSet;
import java.util.Scanner;

public class string7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println((int)str.charAt(0)+" "+(int)str.charAt(str.length()-1));
    }
}
