import java.util.Random;
import java.util.Scanner;
public class game_19 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner vvod = new Scanner(System.in);
        int[] pin = {random.nextInt(10), random.nextInt(10), random.nextInt(10), random.nextInt(10)};

        System.out.println("Угадайте четырехзначный код (цифры от 0 до 9). У вас есть 20 попыток.");

        for (int i = 1; i <= 20; i++) {
            System.out.print("Попытка " + i + ": ");
            int[] vvel = {vvod.nextInt(), vvod.nextInt(), vvod.nextInt(), vvod. nextInt()};

            int count =0;

            for(int j=0;j<4;j++){
                if(pin[j]== vvel[j]){
                    count++;
                }
            }

            if(count ==4){
                System.out.println("Вы угадали код!");
                return;
            } else{
                System.out.println(count +" цифр совпали, попробуйте еще раз.");
            }
        }
        System.out.println("Попытки закончились. Код был: "+ pin[0]+ pin[1]+ pin[2]+ pin[3]);
    }
}
