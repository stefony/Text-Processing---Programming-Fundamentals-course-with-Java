package TextProcessing;

import java.util.Scanner;

public class P11_Replace_Repeating_Chars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine().trim();
        StringBuilder text  = new StringBuilder();

        if (input==null || input.length()==0){
            return;
        }
        char first= input.charAt(0);
        text.append(first);
        for (int i = 1; i <input.length() ; i++) {
            char second = input.charAt(i);
            if (second!=first){
                text.append(second);
                first=second;
            }
        }
        System.out.println(text);
    }
}
