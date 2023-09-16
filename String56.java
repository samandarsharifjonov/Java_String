import java.util.Scanner;

public class String56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int min = Integer.MAX_VALUE;
        String[] array = line.split(" ");
        String minWords = "";


        for (int i = array.length-1; i >= 0; i--) {

            if (array[i].length() < min) {
                min = array[i].length();
                minWords = array[i];
            }

        }

        System.out.println(minWords);
    }
}
