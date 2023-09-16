import java.util.Scanner;

public class string3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char s = scanner.next().charAt(0);
        System.out.println((char) (s-1)  +" " +(s)+" "+(char) (s+1));

    }
}
