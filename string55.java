import java.util.Scanner;

public class string55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int max = Integer.MIN_VALUE;
        String[] arr = line.split(" ");
        String s = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max) {
                max = arr[i].length();
                s = arr[i];

            }
        }
        System.out.println(s);
    }
}
