import java.util.Scanner;
public class cez_18 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите зашифрованное сообщение: ");
        String eMessage = vvod.nextLine();

        System.out.print("Введите количество позиций для сдвига: ");
        int shift = vvod.nextInt();

        String decryptedMessage = decryptMessage(eMessage, shift);

        System.out.println("Расшифрованное сообщение: " + decryptedMessage);
    }

    public static String decryptMessage(String mes, int shr) {
        StringBuilder decryptedBuilder= new StringBuilder();

        for (int i = 0; i < mes.length(); i++) {
            char ch= mes.charAt(i);
            if(Character.isLetter(ch)) {
                int shrCh =(ch-'a'- shr)%26+'a';
                if(shrCh <'a') shrCh +=26;
                if(Character.isUpperCase(ch)) shrCh -=32;
                ch=(char) shrCh;
            }
            decryptedBuilder.append(ch);
        }

        return decryptedBuilder.toString();
    }
}
