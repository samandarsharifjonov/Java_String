import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class string26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String txt = scanner.next();
        boolean tru = false;

        if ( txt.length() < n){
            for (int i = 0; i < Math.abs(txt.length()-n); i++) {
                System.out.print(".");
                tru = true;
            }
        }else {
            System.out.println(txt.substring(txt.length()-n));
        }
        if (tru) System.out.println(txt);

    }
}
