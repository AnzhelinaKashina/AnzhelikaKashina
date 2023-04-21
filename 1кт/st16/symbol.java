package st16;

import java.util.Scanner;

public class symbol {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        String vvod = scan.nextLine();
        int upperCount = 0, lowerCount = 0;
        for (int i = 0; i < vvod.length(); i++) {
            char c = vvod.charAt(i);
            if (Character.isUpperCase(c)) {
                upperCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCount++;
            }
        }
        if (upperCount > lowerCount) {
            vvod = vvod.toUpperCase();
        } else if (lowerCount > upperCount) {
            vvod = vvod.toLowerCase();
        } else {
            vvod = vvod.toLowerCase();
        }
        System.out.println(vvod);
    }
}
