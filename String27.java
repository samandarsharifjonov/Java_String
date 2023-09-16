import java.util.Scanner;

public class String27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        scanner.nextLine();

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String sum = "";


        for (int i = 0; i < n1; i++) {
            sum+=str1.charAt(i);
        }

        for (int i = 0; i < n2; i++) {
            sum+=str2.charAt(str2.length()-n2+i);
            /*assalo mu*/
        }

        System.out.println(sum);


    }
}
