import java.util.Scanner;

public class string64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int k = scanner.nextInt();
        String sum = "";


        for (int i = 0; i < line.length(); i++) {
            if (Character.isUpperCase(line.charAt(i))){

                if (line.charAt(i)-k < 'A') sum+=(char)(line.charAt(i)-k+26);
                else sum+=(char)(line.charAt(i)-k);

            }else if (Character.isLowerCase(line.charAt(i))){

                if (line.charAt(i)-k < 'a') sum+=(char)(line.charAt(i)-k+26);
                else sum+=(char)(line.charAt(i)-k);

            }else sum+=line.charAt(i);

        }

        System.out.println(sum);

    }
}
