import java.util.Scanner;

public class string30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        scanner.nextLine();
        String txt1 = scanner.nextLine();
        String txt2 = scanner.nextLine();
        String sum = "";

        for (int i = 0; i < txt1.length(); i++) {
            if (txt1.charAt(i) == c){
                sum +=  txt1.charAt(i) + txt2;
            }else {
                sum += txt1.charAt(i);
            }
        }
        System.out.println(sum);

    }
}
