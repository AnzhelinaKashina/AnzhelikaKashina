import java.util.Scanner;

public class ss_13 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введите n: ");
            n = vvod.nextInt();
            if (n <= 0) {
                System.out.println("Число n должно быть положительным");
            }
        } while (n <= 0);

        System.out.print("Введите p: ");
        int p = vvod.nextInt();
        double res = resh(n, p);
    }

    public static int resh(int n, int p) {
        if (n < 10) {
            return -1;
        }

        int sum = 0;
        int[] myArr = new int[String.valueOf(n).length()];
        int step = n;

        for (int i = myArr.length - 1; i >= 0; i--) {
            myArr[i] = step % 10;
            step = step / 10;
            myArr[i] = (int) Math.pow(myArr[i], p + i);
            sum += myArr[i];
        }

        if (sum % n == 0) {
            int result = sum / n;
            StringBuilder sb = new StringBuilder();
            sb.append("(").append(n).append(", ").append(p).append(") => ");

            for (char c : String.valueOf(n).toCharArray()) {
                sb.append(c).append("**").append(p).append("+");
                p++;
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("=").append(sum).append("=").append(n).append("*").append(result);
            System.out.println(sb.toString());

            return result;
        } else {
            System.out.println("Сумма последовательных степеней ряда каждой из цифр не является произведением этого числа");
            return -1;
        }
    }
} 