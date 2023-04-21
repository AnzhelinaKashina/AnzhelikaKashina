package st11;

import java.util.Scanner;

public class glasn {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String stroka = vvod.nextLine();
        String zamena = stroka.replaceAll("[АУОЫИЭЯЮЕауоыиэяюе]", "");
        System.out.println(zamena);
    }
}
