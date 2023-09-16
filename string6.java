import java.util.Scanner;

public class string6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char s = scanner.next().charAt(0);

        if (Character.isDigit(s)){
            System.out.println("digit");

        }else if ( s >= 'A' && s <='Z' || s >='a' && s<='z'){
            System.out.println("lotin");
        }else {
            System.out.println(0);
        }
    }
}
