import java.util.*;

public class fibon_15 {

    public static void main(String[] args) {
        System.out.println("Введите x в F(x)");
        Scanner vvod = new Scanner(System.in);
        int i = vvod.nextInt();

        long a = 0, b = 1;

        for (int j=2; j<=i; j++) {
            long c=a+b;
            a=b;
            b=c;
        }

        String s=Long.toString(b);


        int[] count=new int[10];

        for(int k=0;k<s.length();k++){
            char ch=s.charAt(k);
            count[ch-'0']++;
        }


        int maxCount=-1,maxDigit=-1;

        for(int k=9;k>=0;k--){
            if(count[k]>maxCount){
                maxCount=count[k];
                maxDigit=k;
            }
        }

        System.out.println("["+"("+maxCount+","+maxDigit+")"+"]");
    }
}