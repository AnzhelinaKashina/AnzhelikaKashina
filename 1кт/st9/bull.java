package st9;

import java.util.Scanner;

public class bull {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String one = vvod.nextLine();

        System.out.print("Введите вторую строку: ");
        String two = vvod.nextLine();

        boolean endsWith = one.endsWith(two);
        if (endsWith) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
