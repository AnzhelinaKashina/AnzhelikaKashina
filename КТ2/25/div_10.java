import java.util.Scanner;

public class div_10 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);

        System.out.print("Введите m: ");
        int M = vvod.nextInt();

        System.out.print("Введите n: ");
        int N = vvod.nextInt();

        System.out.print("Количество делителей: ");
        int nDiv = vvod.nextInt();

        System.out.print("Делители: ");
        int[] divs = new int[nDiv];
        for (int i = 0; i < nDiv; i++) {
            divs[i] = vvod.nextInt();
        }
        int sum1 = 0;
        for (int div : divs) {
            int sum = 0;
            for (int num = M; num <= N; num++) {
                if (num % div == 0) {
                    sum += num;
                }
            }
            sum1 += sum;
        }
        System.out.println("Сумма делителей: " + sum1);
    }
}
