package Exercicios;
import java.util.Scanner;

public class Exercicio007 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int A = n.nextInt();
        int B = n.nextInt();
        int C = n.nextInt();
        int D = n.nextInt();
        int DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
