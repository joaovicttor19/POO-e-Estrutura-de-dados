package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio009 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner n = new Scanner(System.in);
        String nomefuncionario = n.next();
        double salariofixo = n.nextDouble();
        double vendasefetuadas = n.nextDouble();
        double comissao = vendasefetuadas * 0.15;
        double salariofinal = salariofixo + comissao;
        System.out.printf("TOTAL = %.2f%n" , salariofinal);

    }
}

