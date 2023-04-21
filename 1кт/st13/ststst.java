package st13;

import java.util.Scanner;

public class ststst {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите начало ряда: ");
        int start = vvod.nextInt();

        System.out.print("Введите шаг: ");
        int step = vvod.nextInt();

        System.out.print("Введите количество шагов: ");
        int  stop = vvod.nextInt();

        for (int i = 0; i < stop; i++) {
            int num = start + i * step;
            System.out.print(num + " ");
        }
    }
}
