package entrega;

import java.util.Locale;
import java.util.Scanner;

public class entrega04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner imput = new Scanner(System.in);
        int  a = 0 , b = 0 , c = 0 , d = 0;
        int i = 0;
        while (i>=0){
            System.out.printf("Digite um númmero: ");
            i = imput.nextInt();
            if (i>= 0 && i <=25){
                a++;
            } else if (i>= 26 && i<=50) {
                b++;
            } else if (i>= 51 && i<= 75){
                c++;
            } else if (i>= 76 && i<= 100) {
                d++;

            }
        }

        System.out.printf("[0,25] = %d%n", a);
        System.out.printf("[26,50] = %d%n", b);
        System.out.printf("[51,75] = %d%n" , c);
        System.out.printf("[76,100] = %d%n" , d);

    }
}
