package st7;

import java.util.Scanner;

public class squNum {
    public static void main(String[] args) {
        int br = Integer.MAX_VALUE;
        int num = 0;
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        int dali = vvod.nextInt();
        for (int i = 0; i <= dali; i++) {
            int diff = Math.abs((i * i) - dali);
            if (diff < br) {
                br = diff;
                num = i;
            }
        }
        System.out.println("Ближайщий квадрат числа " + num);

    }
}
