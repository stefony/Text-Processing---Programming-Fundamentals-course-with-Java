package TextProcessing;

import java.util.Scanner;

public class P08_Extract_File {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //C:\Internal\training-internal\Template.pptx
        String text = scanner.nextLine();
        String[] textArr = text.split("\\\\");
        String pathFile = textArr[textArr.length-1];

        String file = pathFile.split("\\.")[0];
        String extension = pathFile.split("\\.")[1];

        System.out.println("File name: " + file);
        System.out.println("File extension: " + extension);
    }
}
