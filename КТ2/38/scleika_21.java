import java.util.Arrays;
import java.util.Scanner;

public class scleika_21 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = vvod.nextLine();
        String[] sentences = text.split("\\.\\s*");

        for (String sentence : sentences) {
            String[] words = sentence.split("\\s+");

            for (int i = 0; i < words.length; i++) {
                char firstLetter = words[i].charAt(0);
                words[i] = words[i].substring(1) + firstLetter + "ауч";
            }
            String newSentence= Arrays.toString(words).replace(",", "").replace("[", "").replace("]", "");

            System.out.print(newSentence.trim() + ". ");
        }
    }
}

