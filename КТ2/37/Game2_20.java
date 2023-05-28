import java.util.ArrayList;
import java.util.Scanner;
public class Game2_20 {
        public static void main(String[] args) {
            Scanner vvod = new Scanner(System.in);
            System.out.print("Введите количество игроков: ");
            int chPlay = vvod.nextInt();
            System.out.print("Введите номер игрока, с которого начинается игра (от 1 до " + chPlay + "): ");
            int start = vvod.nextInt() - 1;
            ArrayList<Integer> play = new ArrayList<>();
            for (int i = 0; i< chPlay; i++) {
                play.add(i+1);
            }

            ArrayList<Integer> result = new ArrayList<>();
            int count=0;
            while(play.size()>1) {
                count++;

                if(count%3==0) {
                    int indexToRemove=(start +count-1)% play.size();
                    result.add(play.get(indexToRemove));

                    if(indexToRemove== play.size()-1){
                        start =0;
                    } else{
                        start =indexToRemove;}

                    play.remove(indexToRemove);

                } else{
                    if(start >= play.size()-2){
                        start =-2;}

                    start +=2;}

            }
            String vib ="Выбыли следующие игроки: ";
            for(int player : result){
                vib += player+" ";}
            vib +="\nПобедитель: "+ play.get(0);
            System.out.println(vib);
        }
}

