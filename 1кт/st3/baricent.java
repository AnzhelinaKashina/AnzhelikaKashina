package st3;

import java.util.Scanner;

public class baricent {
    public static void main(String[] args) {
    Scanner vvod = new Scanner(System.in);
    float treygolnik[][] = new float[3][2];
    for(int i = 0; i < 3; i++){
        System.out.println("Введите координаты  вершин треугольника через enter");
        for(int j = 0; j < 2; j++){
            treygolnik[i][j] = vvod.nextInt();
        }
    }
    System.out.println("Медианы пересекаются в точке с координатами" + " {" + (treygolnik[0][0]/3 + treygolnik[1][0]/3 + treygolnik[2][0]/3) + ","
            + (treygolnik[0][1]/3 + treygolnik[1][1]/3 + treygolnik[2][1]/3) + "}");
        }
    }

