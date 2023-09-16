import java.util.Scanner;

public class string63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int k = scanner.nextInt();
        String sum = "";

        for (int i = 0; i < line.length(); i++) {

           if (Character.isUpperCase(line.charAt(i))){ // katta hariga tekshirish

               if (line.charAt(i)+k > 'Z') sum+=(char)(line.charAt(i)+k-26);
               else sum+=((char)(line.charAt(i)+k));

           }else if (Character.isLowerCase(line.charAt(i))) {

               if (line.charAt(i)+k > 'z') sum+=(char)(line.charAt(i)+k-26);
               else sum+=((char)(line.charAt(i)+k));

           }else {

               sum+=((char)line.charAt(i));
           }

        }
        System.out.println(sum);
    }
}
