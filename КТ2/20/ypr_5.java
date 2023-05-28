import java.io.FileWriter;
import java.io.IOException;
public class ypr_5 {
    public static void main(String[] args) {
        int m = 8;
        int n = 7;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int ring = Math.min(Math.min(i, j), Math.min(m - i - 1, n - j - 1));
                arr[i][j] = ring + 1;
            }
        }
        try (FileWriter vvod = new FileWriter("mass.txt")) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    vvod.write(arr[i][j] + " ");
                }
                vvod.write("\n");
            }
        } catch (IOException mas) {
            mas.printStackTrace();
        }
    }
}

