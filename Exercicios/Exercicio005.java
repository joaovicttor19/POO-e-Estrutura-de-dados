package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio005 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner n = new Scanner(System.in);
        double A = n.nextDouble();
        double B = n.nextDouble();
        double MEDIA = ((A * 3.5) + (B * 7.5)) / 11.0;
        System.out.printf("MEDIA = %.5f%n", MEDIA);


    }
}
