package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio011 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner n = new Scanner(System.in);
        double pi = 3.14159;
        double raio = n.nextDouble();
        double volumeesfera = (4/3.0) * pi * Math.pow(raio,3);

        System.out.printf("VOLUME = %.3f%n" , volumeesfera);
    }
}

