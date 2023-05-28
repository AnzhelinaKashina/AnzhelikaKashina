import java.util.Scanner;
public class del_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите M: ");
        int M = scanner.nextInt();

        System.out.print("Введите N: ");
        int N = scanner.nextInt();

        System.out.print("Количество делителей: ");
        int ndel = scanner.nextInt();

        System.out.print("Делители: ");
        int[] divs = new int[ndel];
        for (int i = 0; i < ndel; i++) {
            divs[i] = scanner.nextInt();
        }

        for (int div : divs) {
            int sum = 0;
            for (int num = M; num <= N; num++) {
                if (num % div == 0) {
                    sum += num;
                }
            }
            System.out.println("Сумма делителей " + div + ": " + sum);
        }
    }
}

