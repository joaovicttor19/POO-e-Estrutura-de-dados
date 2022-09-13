package entrega;

import java.util.Scanner;

public class entrega010 {
    public static void main(String[] args) {
            Scanner imput = new Scanner(System.in);
            int fatorial = 1 , valor;
            System.out.println("Digite um número:");
            valor = imput.nextInt();
            for (int cont; valor>1 ; valor--) {
                fatorial = fatorial * valor;
            }
            System.out.println("A fatorial é:"+fatorial);
        }
    }

