package st14;

import java.util.Scanner;

public class iacheiki {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int[] index = new int[3];

        for (int i = 0; i < index.length; i++) {
            System.out.print("Введите число: ");
            int vvodIndex = vvod.nextInt();
            if (i == 0 || vvodIndex > index[0]) {
                index[2] = index[1];
                index[1] = index[0];
                index[0] = vvodIndex;
            } else if (i == 1 || vvodIndex > index[1]) {
                index[2] = index[1];
                index[1] = vvodIndex;
            } else {
                index[2] = vvodIndex;
            }
        }
        System.out.println(index[0] + ", " + index[1] + ", " + index[2]);
    }
}
