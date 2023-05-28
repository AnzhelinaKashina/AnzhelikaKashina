import java.util.Scanner;

public class sasTan_16 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        long n = vvod.nextLong();

        while (n > 1) {
            if (n % 2 == 0) {
                if ((n / 2) % 2 == 0 || n / 2 ==1 ) {

                    n /= 2;
                } else {

                    n--;
                }
            } else {
                System.out.println("Саша");
                return;
            }

            System.out.println("Таня");
        }

        System.out.println("Саша");
    }
}