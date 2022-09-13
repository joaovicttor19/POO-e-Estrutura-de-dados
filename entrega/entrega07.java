package entrega;

import java.util.Scanner;

public class entrega07 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int i, n;
        System.out.println("Digite um valor de 1 a 10:");
        n = imput.nextInt();
        System.out.println();
        for (i=1; i<=10; i++){
            System.out.printf("N x %d = %d%n" ,i , (n*i));
        }
    }
}
