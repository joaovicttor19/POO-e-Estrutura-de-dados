package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio015 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner n = new Scanner(System.in);
        double x1 = n.nextDouble();
        double y1 = n.nextDouble();
        double x2 = n.nextDouble();
        double y2 = n.nextDouble();
        double distanciaxy = Math.sqrt(Math.pow(x2 - x1 ,2) +  Math.pow(y2 - y1 ,2));
        System.out.printf("%.4f%n" , distanciaxy);
    }
}
