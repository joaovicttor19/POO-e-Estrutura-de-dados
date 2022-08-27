package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio012 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner n = new Scanner(System.in);

        double PI = 3.14159;
        double A = n.nextDouble();
        double B = n.nextDouble();
        double C = n.nextDouble();

        double areatrianguloretangulo = (A * C) / 2.0;
        double areacirculo = PI * Math.pow(C,2);
        double areatrapezio = ((A + B)* C) / 2;
        double areaquadrado = B * B ;
        double arearetangulo = A * B ;

        System.out.printf("TRIANGULO: %.3f%n" , areatrianguloretangulo);
        System.out.printf("CIRCULO: %.3f%n" , areacirculo);
        System.out.printf("TRAPEZIO: %.3f%n" ,  areatrapezio);
        System.out.printf("QUADRADO: %.3f%n" , areaquadrado);
        System.out.printf("RETANGULO: %.3f%n" ,  arearetangulo);
    }
}
