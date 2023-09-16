import java.util.Scanner;

public class string42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] array = line.split(" ");
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(0)==array[i].charAt(array[i].length()-1)){
                count++;
            }
        }
        System.out.println(count);

    }
}
