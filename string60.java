import java.util.Scanner;

public class string60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int index = line.indexOf('\\');

        if (index == -1){
            return;
        }

        String frist = line.substring(index+1, line.indexOf("\\", index+1));
        System.out.println(frist);

    }
}
