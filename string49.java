import java.util.Scanner;

public class string49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        String [] array =str.split(" ");
        String s="";

        /*maksimum*/     /*.aksi.um*/

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length()-1; j++) {
                if (array[i].charAt(j) == array[i].charAt(array[i].length()-1)){
                    s+=".";
                }else {
                    s+=array[i].charAt(j);
                }

            }
            s+=(array[i].charAt(array[i].length()-1));
            if (i < array.length-1) s+= " ";
        }

        System.out.println(s);

      /*  for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length()-1; j++) {
                if(array[i].charAt(j)== array[i].charAt(array[i].length()-1))s+=".";
                else s+= array[i].charAt(j);
            }
            s+=(array[i].charAt(array[i].length()-1));
            if(i< array.length-1)s+=" ";
        }
        System.out.println(s);*/

    }
}
