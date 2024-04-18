package TextProcessing;

import java.util.Scanner;

public class P12_String_Explosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder textBuilder = new StringBuilder(input);
        int total = 0;
        for (int i = 0; i <=textBuilder.length()-1 ; i++) {
            char current = textBuilder.charAt(i);

            if (current=='>'){
                int explosionPower = Integer.parseInt(textBuilder.charAt(i+1) + "");
                total+=explosionPower;

            }else if (current!='>' && total>0){
                textBuilder.deleteCharAt(i);
                total--;
                i--;
            }
        }
        System.out.println(textBuilder);
    }
}
