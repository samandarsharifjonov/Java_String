import java.time.chrono.MinguoDate;
import java.util.Scanner;

public class string39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

       /*assalom alaykum azizlar afsuski bu yerda faqat alaykum qolar ekan*/
//      alaykum

        int fristIndex = line.indexOf(' ');
        int secondIndex = line.indexOf(' ', fristIndex+1);

       // System.out.println(fristIndex); // index 7
       // System.out.println(secondIndex); // index 15
        // System.out.println(fristIndex+1);

        if (secondIndex >= 0 && secondIndex > fristIndex+1){
            String string = line.substring(fristIndex+1, secondIndex);
           // System.out.println(string);
        }else {
            // System.out.println("");
        }

    }
}
