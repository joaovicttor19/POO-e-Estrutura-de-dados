package entrega;

import java.util.Scanner;

public class entrega03 {
    public static void main(String[] args) {
        Scanner imput= new Scanner(System.in);
        System.out.println("Digite os números:");
        int Numpositivo = 0;
        int Numnegativo = 0;
        int Quantnume = 0;
        int soma = 0;
        int numero;
        int Media;
        while (true) {
            numero = imput.nextInt();
            if (numero == 0) break;
            else if (numero > 0) {
                Numpositivo++;
            } else {
                Numnegativo++;
            }
            Quantnume++;
            soma = soma + numero;
        }
        Media = soma / Quantnume;
        double porcPositivo = (double) Numpositivo/ Quantnume* 100;
        double porcnegativo = (double) Numnegativo / Quantnume* 100;
        System.out.println("Média: " + Media);
        System.out.println("Total números: " + Quantnume);
        System.out.println("Números Positivos: " + Numpositivo);
        System.out.println("Numeros Negativos: " + Numnegativo);
        System.out.println("Porcentagem Positivos: " + porcPositivo);
        System.out.println("Porcentagem Negativos: " + porcnegativo);
    }
}
