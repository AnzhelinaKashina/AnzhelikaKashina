package st6;

import java.util.Scanner;

public class srt {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите число: ");
        int ch = vvod.nextInt();
        if (noPrime(ch)) {
            System.out.println(ch + " это простое число");
        } else {
            System.out.println(ch + " это не простое число");
        }
    }
    public static boolean noPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

