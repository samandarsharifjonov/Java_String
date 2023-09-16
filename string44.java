import java.util.Scanner;

public class string44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] array = line.split(' ' + "" );
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            int k = array[i].length()-array[i].replaceAll("A","").length();
            if(k==3) sum++;
        }

        System.out.println(sum);
    }
}
