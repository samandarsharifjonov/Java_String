import javax.sql.rowset.serial.SerialStruct;
import java.util.Scanner;

public class string48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] array = line.split(" ");
        String s = " ";
        String result = " ";

        /*assalom alaykum minimum*/

        for (int i = 0; i < array.length; i++) {
            s = array[i].replaceAll(array[i].charAt(0)+"", ".");
            result+= s.replaceFirst(".", array[i].charAt(0) + "")+" ";
        }
        System.out.println(result);

        /*s = array[i].replaceAll(array[i].charAt(0) + "", ".");
            result += s.replaceFirst(".", array[i].charAt(0) + "") + " ";*/
    }
}
