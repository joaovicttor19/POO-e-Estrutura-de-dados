package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio002 {
    public static  void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double n = 3.14159;
        double raio = input.nextDouble();
        double area = n * Math.pow(raio,2);
        System.out.printf("A = %.4f%n", area);


    }
}
