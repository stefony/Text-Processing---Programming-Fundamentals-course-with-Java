package TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02_Repeat_Strings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String [] words =  scanner.nextLine().split(" ");

        List<String> repeatList = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String current = words[i];
            int length = current.length();
            String repeat = repeatString(current,length);

            repeatList.add(repeat);

        }
        System.out.println(String.join("",repeatList));
    }
    public  static String repeatString (String word , int count){
        String result = "";
        for (int i = 0; i < count; i++) {
            result=result+word;

        }
        return result;
    }
}
