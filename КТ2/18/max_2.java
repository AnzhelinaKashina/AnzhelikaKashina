import java.util.Arrays;
import java.util.Scanner;
public class max_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа массива через запятую: ");
        String vvod = scanner.nextLine();
        String[] strArray = vvod.split(",");

        int[] araaay = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            araaay[i] = Integer.parseInt(strArray[i]);
        }

        int[] result = max(araaay);
        int maxVal = result[0];
        int maxIndex = result[1];

        int[] araaayL = Arrays.copyOfRange(araaay, 0, maxIndex);
        int[] araaayR = Arrays.copyOfRange(araaay, maxIndex + 1, araaay.length);

        System.out.println("Исходный массив чисел: " + vvod);
        System.out.println("Максимальное число: " + maxVal);
        System.out.println("Первый массив: " + Arrays.toString(araaayL));
        System.out.println("Второй массив: " + Arrays.toString(araaayR));
    }
    public static int[] max (int[] araaay) {
        int maxEl = 0;
        for (int i = 1; i < araaay.length; i++) {
            if (araaay[i] > araaay[maxEl]) {
                maxEl = i;
            }
        }
        return new int[]{araaay[maxEl], maxEl};
    }
}
