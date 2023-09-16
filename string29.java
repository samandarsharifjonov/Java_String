import java.util.Scanner;

public class string29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        scanner.nextLine();

        String txt1 = scanner.nextLine();
        String txt2 = scanner.nextLine();
        String  s="";

        for (int i = 0; i < txt1.length(); i++) {
            if(c==txt1.charAt(i)){
                s+=txt2 + txt1.charAt(i);
            }
            else s+=txt1.charAt(i);
        }
        System.out.println(s);
    }
}
