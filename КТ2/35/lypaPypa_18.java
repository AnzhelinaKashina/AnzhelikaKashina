

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class lypaPypa_18 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите список весов через пробел:");
        String input = vvod.nextLine();

        String[] weightsStr = input.split(" ");
        Arrays.sort(weightsStr, Comparator.comparingInt(lypaPypa_18::sum).reversed());
        System.out.println(String.join(" ", weightsStr));
    }

    private static int sum(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }
        return sum;
    }
}