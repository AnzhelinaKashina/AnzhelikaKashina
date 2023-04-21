package st4;

import java.util.Scanner;

public class symb {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String slovo = vvod.nextLine();
        System.out.print("Введите символ: ");
        char symbol = vvod.next().charAt(0);
        int chet = 0;
        for (int i = 0; i < slovo.length(); i++) {
            if (slovo.charAt(i) == symbol) {
                chet++;
            }
        }System.out.println("Символ  " + symbol +" входит в слово "+slovo +" -- "+ chet + " раз");

    }
}

