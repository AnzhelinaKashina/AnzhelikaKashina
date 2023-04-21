package st10;

import java.util.Scanner;

public class anzhelika {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = vvod.nextLine().trim();
        String izmName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Привет, " + izmName + "!");
    }
}
