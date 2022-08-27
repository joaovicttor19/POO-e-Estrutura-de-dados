package Exercicios;
import java.util.Scanner;

public class Exercicio013 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int A = n.nextInt();
        int B = n.nextInt();
        int C = n.nextInt();
        int maiorAB = (A + B + Math.abs(A - B)) / 2 ;
        int maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
        System.out.println(maiorABC + " eh o maior");

    }
}
