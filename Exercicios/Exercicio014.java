package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio014 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner n = new Scanner(System.in);
        int distanciapercorrida = n.nextInt();
        double totalcombustivel = n.nextDouble();
        double mediacombustivelgasto = distanciapercorrida / totalcombustivel;

        System.out.printf("%.3f km/l%n" , mediacombustivelgasto);

    }
}
