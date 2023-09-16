import java.util.Scanner;

public class string23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.next();
        String[] array = txt.split("[+,-]");
        String PlusMinus = "";

        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == '+' || txt.charAt(i) == '-') PlusMinus += txt.charAt(i);
        }
        int k = Integer.parseInt(array[0]);
        int s = 0;
        for (int i = 1; i < array.length; i++) {
            if (PlusMinus.charAt(s++) == '-') k -= Integer.parseInt(array[i]);
            else k += Integer.parseInt(array[i]);
        }
        System.out.println(k);
    }
}
