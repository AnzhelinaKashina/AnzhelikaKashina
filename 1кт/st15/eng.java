package st15;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class eng {
    public static String strRemont(String string) {
        String[] words = string.split("\\s+");
        List<String> nonRepeatingWords = new ArrayList<>();
        for (String word : words) {
            if (!nonRepeatingWords.contains(word)) {
                nonRepeatingWords.add(word);
            }
        }
        return String.join(" ", nonRepeatingWords);
    }
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = vvod.nextLine();
        String result = strRemont(string);
        System.out.println(result);
    }
}
