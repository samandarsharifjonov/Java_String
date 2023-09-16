import java.util.Scanner;

public class string51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arry = str.split(" ");

        for (int i = 0; i < arry.length; i++) {
            int min = 'Z';
            int mindex = 0;
            for (int j = i; j < arry.length; j++) {
                if (arry[j].charAt(0) < min) {
                    min = arry[j].charAt(0);
                    mindex = j;
                }
            }

            String temp = arry[i];
            arry[i] = arry[mindex];
            arry[mindex] = temp;
            String s = "";
            if (i < arry.length - 1) s = " ";
            System.out.print(arry[i] + s);
        }
    }
}
