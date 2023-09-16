import java.util.Scanner;

public class string22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        int n = 0, k = 0, r = 0;
        n = Integer.parseInt(txt);

        while (n > 0){
            k = n % 10;
            r = r + k;
            n = n / 10;
        }

        System.out.println(r);
    }
}


