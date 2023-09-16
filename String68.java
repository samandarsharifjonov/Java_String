import java.util.Scanner;

public class String68 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String satr = scanner.nextLine();
        String satr2 ="";

        /*absde45kd*/
        /*absdekd*/
        /*abxy6878c*/

        for (int i = 0; i < satr.length(); i++) {
            if ((int)satr.charAt(i) >= 65 && (int)satr.charAt(i) <= 122){
                satr2+=satr.charAt(i);
            }
        }

        boolean t = true;
        for (int i = 0; i < satr2.length()-1; i++) {
            if ((int)satr2.charAt(i+1) >= (int) satr2.charAt(i)) t = true;
            else {
                t = false;
                System.out.println(satr2.charAt(i+1));
                break;
            }
        }

        if (t) System.out.println(0);
    }
}
