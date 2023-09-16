import java.util.Scanner;

public class string61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        int lastIndex = line.lastIndexOf('\\');
        line = line.substring(0,lastIndex);
        lastIndex = line.lastIndexOf('\\');
        System.out.println(line.substring(lastIndex+1));


       /* int k = line.lastIndexOf("\\");
        line = line.substring(0,k);
        k = line.lastIndexOf('\\');
        System.out.println(line.substring(k+1));*/
    }
}
