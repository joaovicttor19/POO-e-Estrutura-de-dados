package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio010 {
    public static void main(String[] args){
                Locale.setDefault(Locale.US);
                Scanner n = new Scanner(System.in);
                int codigopec1 = n.nextInt();
                int quantidadepec1 = n.nextInt();
                double valorpec1 = n.nextDouble();
                int codigopec2 = n.nextInt();
                int quantidadepec2 = n.nextInt();
                double valorpec2 = n.nextDouble();
                double total = quantidadepec1 * valorpec1  + quantidadepec2 * valorpec2 ;
                System.out.printf("VALOR A PAGAR: R$ %.2f%n" , total);
    }
}
