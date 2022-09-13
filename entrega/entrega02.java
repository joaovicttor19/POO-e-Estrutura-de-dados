package entrega;

import java.util.Locale;
import java.util.Scanner;

public class entrega02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner imput = new Scanner(System.in);
        Double maior = Double.MIN_VALUE;
        Double menor = Double.MAX_VALUE;

        for (int i = 0; i < 15; i++) {
            System.out.println("Digite sua altura: ");
            Double altura = imput.nextDouble();

            if (maior < altura) {
                maior = altura;
            }
            if (menor > altura) {
                menor = altura;
            }

        }
        System.out.printf(" A altura maior: %.2f%n" ,maior);
        System.out.printf("A altura menor: %.2f%n" , menor);
    }
}
