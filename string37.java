import java.util.Scanner;

public class string37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();


        int lastIndex = s1.lastIndexOf(s2);
        if (lastIndex != -1){
            s1 = s1.substring(0,lastIndex)+s3 + s1.substring(lastIndex+s2.length()) ;
            System.out.println(s1);
        }

    }
}

