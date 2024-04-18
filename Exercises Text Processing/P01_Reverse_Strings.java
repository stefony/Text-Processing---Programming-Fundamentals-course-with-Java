package TextProcessing;

import java.util.Scanner;

public class P01_Reverse_Strings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("end")){

            String reversed = " ";
            for (int i = input.length()-1; i >=0; i--) {
                char current = input.charAt(i);
                reversed+=current;
            }
            System.out.printf("%s =%s%n",input,reversed);
            input= scanner.nextLine();

        }


    }
}
