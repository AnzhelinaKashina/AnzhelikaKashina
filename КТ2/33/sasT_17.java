import java.util.Scanner;

public class sasT_17 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        long n = vvod.nextLong();
        long tanPlay = playGame(n, true);
        System.out.println(tanPlay);
    }

    private static long playGame(long palochki, boolean isTanya) {
        if (palochki== 1) {
            return isTanya ? 0 : 1;
        }

        if (palochki % 2 == 0) {
            if (isTanya) {
                return Math.max(playGame(palochki /2 , false), playGame(palochki-1,false));

            } else {
                return palochki;

            }
        } else {
            if (isTanya) {
                return playGame(palochki-1, false);
            } else {
                return palochki;
            }
        }
    }
}