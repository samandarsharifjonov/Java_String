import java.util.Scanner;

public class String57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String result = line.replaceAll("\\s+", " ");
        StringBuilder sb = new StringBuilder(line);
        System.out.println(result);


    }
}
