package TextProcessing;

import java.util.Scanner;

public class P05_Digits_Letters_and_Other {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (int i = 0; i <text.length() ; i++) {
            char symbol = text.charAt(i);

            if (Character.isDigit(symbol)){
                digits.append(symbol);
            }else if (Character.isLetter(symbol)){
                letters.append(symbol);
            }else {
                other.append(symbol);
            }

        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(other);
    }

}
