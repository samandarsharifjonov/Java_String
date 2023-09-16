import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class string34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String txt1 = scanner.nextLine();
        String txt2 = scanner.nextLine();

        int LastIndex = txt1.lastIndexOf(txt2);
        if (LastIndex != -1) {
            String result = txt1.substring(0, LastIndex) + txt1.substring(LastIndex + txt2.length());
            System.out.println(result);
        }
    }
}

