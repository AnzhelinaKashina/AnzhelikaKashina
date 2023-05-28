import java.util.Scanner;

public class sqrt_12 {
    public static void main(String[] args) {
    Scanner vvod = new Scanner(System.in);
    System.out.print("Введите число: ");
    int ch = vvod.nextInt();
    for (int i = 1; i <= Math.sqrt(ch); i++) {
        if (ch % i == 0) {
            int j = ch / i;
            if ((i + j) % 2 == 0 && (j - i) % 2 == 0) {
                int x = (i + j) / 2;
                int y = (j - i) / 2;
                if ((x >= 1) && (x < 100000) && (y >= 1) && (y < 100000)) {
                    System.out.println("Разница между двумя последовательными квадратами числа: " + x*x + "-" + y*y);
                }
            }
        }
    }
}
}
