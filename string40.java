import java.util.Scanner;

public class string40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int indexOf = line.indexOf(' ');
        int lastIndex = line.lastIndexOf(' ');
        indexOf++;
        int k = 0;
        for (int i = indexOf; i < lastIndex; i++) {
            if (line.charAt(i)==' '){
                k = i;
            }
            if (k != -1){
                System.out.print(line.charAt(i));
            }else {
                System.out.print(' ');
            }
        }

       /* System.out.println(indexOf);
        System.out.println(lastIndex);
        System.out.println(k);*/



    }
}
