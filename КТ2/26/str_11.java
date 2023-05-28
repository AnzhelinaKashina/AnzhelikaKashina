import java.util.Scanner;

public class str_11 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String x = vvod.nextLine();


        int pal = pal1(x);
        System.out.println("Самый длинный палиндром в строке: " + pal);
    }
    public static int pal1(String put) {
        int a = put.length();
        boolean[][] dp = new boolean[a][a];
        for (int i = 0; i < a; i++) {
            dp[i][i] = true;
        }
        int palindrome2 = 1;
        for (int len = 2; len <= a; len++) {
            for (int i = 0; i <= a - len; i++) {
                int j = i + len - 1;
                if (put.charAt(i) == put.charAt(j) && (len == 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    palindrome2 = len;
                }
            }
        }
        return palindrome2;
    }
}

