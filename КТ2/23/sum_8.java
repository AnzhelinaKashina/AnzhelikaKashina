import java.util.Scanner;

public class sum_8 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);

        System.out.print("Введите N: ");
        int N = vvod.nextInt();

        System.out.print("Введите первый делитель: ");
        int del1 = vvod.nextInt();

        System.out.print("Введите второй делитель: ");
        int del2 = vvod.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (i % del1 == 0 || i % del2 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}

