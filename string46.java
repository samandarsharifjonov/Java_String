import java.util.Scanner;

public class string46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] array = line.split(" ");
        int max = Integer.MIN_VALUE;

        for (String maxsoz: array) {
            if (maxsoz.length() > max){
                max = maxsoz.length();
            }
        }

        System.out.println(max);
    }
}
