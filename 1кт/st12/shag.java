package st12;

import java.util.Scanner;

public class shag {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int start1 = vvod.nextInt();
        System.out.print("Введите второе число: ");
        int start2 = vvod.nextInt();
        int rez= Math.min(start1, start2);
        for (int i = start1; ; i += rez) {
            int sq = i * i;
            System.out.println(sq);
            if (sq >= Math.max(start1, start2) * Math.max(start1, start2)) {
                break;
            }
        }
    }
}
