package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio006 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner n = new Scanner(System.in);
        double A = n.nextDouble();
        double B = n.nextDouble();
        double C = n.nextDouble();
        double MEDIA = ((A * 2) + (B * 3) + (C * 5))/10.0;
        System.out.printf("MEDIA = %.1f%n", MEDIA);
    }
}
