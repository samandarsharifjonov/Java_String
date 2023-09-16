import java.util.Scanner;

public class string12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int n = scanner.nextInt();
        String sum = "";


        for (int i = 0; i < str.length() - 1; i++) {
            sum += str.charAt(i);
            for (int j = 0; j < n; j++) {
                sum += "*";
            }
        }
        sum  +=str.charAt(str.length()-1);
        System.out.println(sum);
    }
}
