import java.util.Scanner;

public class string52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] array = line.split(" ");
        String sum = "";


        for (String soz: array) {
            String element = soz;

            for (int i = 0; i < element.length(); i++) {
                if (i==0){
                    char fristchar = Character.toUpperCase(element.charAt(0));
                    sum += fristchar + element.substring(1) + " ";
                }
            }
        }

        System.out.println(sum);

    }
}
