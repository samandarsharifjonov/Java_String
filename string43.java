import java.util.Scanner;

public class string43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] array = line.split(' ' + "");
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("A")){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
