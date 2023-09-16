import java.util.Scanner;

public class String53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i)=='.' || line.charAt(i) ==',' || line.charAt(i) =='?'){
                count++;
            }
        }
        System.out.println(count);
    }
}
