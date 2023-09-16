import java.util.Scanner;

public class String58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int lastSlesh = line.lastIndexOf('\\');
        int lasdot = line.lastIndexOf('.');
        System.out.println(line.substring(lastSlesh+1, lasdot));


    }
}
