package st8;

import java.util.Scanner;

public class otrez {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите длинны сторон треугольника через enter :\n ");
        int a = vvod.nextInt();
        int b = vvod.nextInt();
        int c = vvod.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            double ygolA = (b * b + c * c - a * a) / (2 * b * c);
            double ygolB = (a * a + c * c - b * b) / (2 * a * c);
            double ygolC = (a * a + b * b - c * c) / (2 * a * b);
            double angleA = Math.toDegrees(Math.acos(ygolA));
            double angleB = Math.toDegrees(Math.acos(ygolB));
            double angleC = Math.toDegrees(Math.acos(ygolC));
            double maxAngle = Math.max(Math.max(angleA, angleB), angleC);
            System.out.println("Наибольший внешний угол треугольника: " + maxAngle);
        } else {
            System.out.println("Треугольника с такими сторонами не существует(");
        }
    }
}

