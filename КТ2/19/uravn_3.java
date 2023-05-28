public class uravn_3 {
    public static void main(String[] args) {
        int x = 10;
        int y = main(x);
        System.out.print("F: " + x +"\nРезультат: "+y);
    }
    public static int main(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else if (x % 2 == 0) {
            return main(x / 2);
        } else {
            return main(x / 2) + main(x / 2 + 1);
        }
    }
}



