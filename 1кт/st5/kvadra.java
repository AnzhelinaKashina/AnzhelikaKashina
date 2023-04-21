package st5;

import java.util.Scanner;

public class kvadra {
    public static void main(String[] args) {
            Scanner vvod = new Scanner(System.in);
            System.out.print("Введите длинну: ");
            int size = vvod.nextInt();
            int[] chislo = new int[size];
            System.out.print("Введите числа через пробел: ");
            for (int i = 0; i < size; i++) {
                chislo[i] = vvod.nextInt();
            }
            int summaKvadra = 0;
            for (int i = 0; i < size; i++) {
                summaKvadra += chislo[i] * chislo[i];
            }
            System.out.println("Сумма квадратов чисел равна: " + summaKvadra);
        }
    }



