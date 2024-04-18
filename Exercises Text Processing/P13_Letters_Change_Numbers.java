package TextProcessing;

import java.util.Scanner;

public class P13_Letters_Change_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] text = input.split("\\s+");

        double total = 0;
        for (String code:text) {

            double number = getNumber(code);
            total+=number;
        }
        System.out.printf("%.2f",total);
    }
    private static double getNumber (String code){

        char first = code.charAt(0);
        char second= code.charAt(code.length()-1);
        double number = Double.parseDouble(code.replace(first,' ').replace(second,' ').trim());

        if (Character.isUpperCase(first)){
            int positionUpperLetter = (int) first - 64;
            number/=positionUpperLetter;
        }else {
            int positionLowerLetter= (int) first -96;
            number*=positionLowerLetter;
        }
        if (Character.isUpperCase(second)){
            int positionUpperLetter = (int) second - 64;
            number-=positionUpperLetter;
        }else {
            int positionLowerLetter = (int) second - 96;
            number+=positionLowerLetter;
        }
        return number;
    }
}
