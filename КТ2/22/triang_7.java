import java.util.Scanner;

public class triang_7 {
    public static void main (String [] args) {
        Scanner vvod = new Scanner (System.in);
        System.out.println ("Введите длины сторон треугольника:");

        System.out.print("1 сторона: ");
        int x = vvod.nextInt();
        System.out.print("2 сторона: ");
        int y = vvod.nextInt();
        System.out.print("3 сторона: ");
        int z = vvod.nextInt();
        int p1 = ((x+y+z)/2);
        double ski = Math.sqrt(p1 * (p1 - x) * (p1 - y) * (p1 - z));
        System.out.println("Площадь:"+ ski);
    }
}

