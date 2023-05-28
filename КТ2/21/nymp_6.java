import java.util.Scanner;
public class nymp_6 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        String y = vvod.nextLine();
        String[] rit = y.split("");
        String str1 = "";
        for (int i = 0; i < rit.length; i++) {
            int w = Integer.parseInt(rit[i]);
            if (rit[i].equals("1") || rit[i].equals("2") || rit[i].equals("3")) {
                w += 6;
                str1 += w;

            }
            if (rit[i].equals("4") || rit[i].equals("5") || rit[i].equals("6") || rit[i].equals("0")) {
                str1 += w;

            }
            if (rit[i].equals("7") || rit[i].equals("8") || rit[i].equals("9")) {
                w -= 6;
                str1 += w;

            }
        }
        System.out.println(str1);


    }
}

