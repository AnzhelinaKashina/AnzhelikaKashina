import java.util.Scanner;

public class cez_12 {
    private static final String rusLowAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    private static char symbol_shift(char sym, int shift){
        if (rusLowAlphabet.indexOf(sym) != -1){
            return rusLowAlphabet.charAt((rusLowAlphabet.indexOf(sym)+shift) % rusLowAlphabet.length());
        }
        else {
            return sym;
        }
    }
    public static void main(String[] args){
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите текст:");
        String str = vvod.nextLine();
        for(int i=1;i<2;i++){
            System.out.println("Зашифрованный текст:");
            for(int j=0;j<str.length();j++){
                System.out.print(symbol_shift(str.charAt(j),i));
            }
            System.out.println();
            System.out.println("Число сдвига:" + i);

        }
    }
}
