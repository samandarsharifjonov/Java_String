import java.util.Scanner;

public class string45 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String line = scanner.nextLine();
        String[] array = line.split(" ");
        int min = Integer.MAX_VALUE;

        for (String soz: array) {
            if (soz.length() < min){
                min = soz.length();
            }
        }

        System.out.println(min);


    }
}
