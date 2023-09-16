import java.util.Scanner;

public class string28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symvol = scanner.next().charAt(0);
        String row = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < row.length(); i++) {
            char currentChar = row.charAt(i);

            if (currentChar==symvol){
                sb.append(currentChar).append(currentChar);
            }else {
                sb.append(currentChar);
            }
        }

        System.out.println(sb.toString());

    }
}
