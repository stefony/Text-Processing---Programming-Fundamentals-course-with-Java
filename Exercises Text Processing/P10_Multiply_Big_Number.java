package TextProcessing;

import java.math.BigInteger;
import java.util.Scanner;

public class P10_Multiply_Big_Number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger first = new BigInteger(scanner.nextLine());
        BigInteger second = new BigInteger(scanner.nextLine());

        System.out.println(first.multiply(second));
    }
}
