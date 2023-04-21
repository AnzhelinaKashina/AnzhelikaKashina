package st2;

import java.util.Scanner;
public class rabotniki {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите работников предприятия массивом состящим из 1 и 0 через запятую: ");
        String polzvVod = vvod.nextLine();
        String[] massivChet = polzvVod.split(",");
        boolean[] chet = new boolean[massivChet.length];
        for (int i = 0; i < massivChet.length; i++) {
            chet[i] = massivChet[i].equals("1");
        }
        int rabotCount = 0;
        for (boolean worker : chet) {
            if (worker) {
                rabotCount++;
            }
        }
        System.out.println("Количество работников предприятия: " + rabotCount);
    }
}
