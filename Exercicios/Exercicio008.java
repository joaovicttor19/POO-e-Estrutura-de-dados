package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio008 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner n = new Scanner(System.in);
        int numerofuncionario = n.nextInt();
        int horatrabalhada = n.nextInt();
        double valorhora = n.nextDouble();
        double salario = horatrabalhada * valorhora;
        System.out.println("NUMBER = " + numerofuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}
