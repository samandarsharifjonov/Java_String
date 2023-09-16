import java.util.Scanner;

public class string045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int min = Integer.MAX_VALUE;
        String sum = "";
        int count = 0;
        String[] arrays = line.split(" ");
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].length() < min){
                min = arrays[i].length();
                sum =arrays[i];

            }
        }
        System.out.println("Eng qisqa so'z =>>> "+sum);
        System.out.println("Uzunligi: =>>> "+sum.length());
    }
}
