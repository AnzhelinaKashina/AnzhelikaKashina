package st1;

import java.util.Scanner;

public class TransMatrix {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите количество строк в матрице: ");
        int rows = vvod.nextInt();
        System.out.print("введите количество столбцов в матрице: ");
        int columns = vvod.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Введите элементы матрицы через пробел:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = vvod.nextInt();
            }
        }
        int[][] transporirMatrix = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transporirMatrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transporirMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
