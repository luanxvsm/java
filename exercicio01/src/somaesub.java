// 4)Faça um programa que receba dois números (por exemplo 10 e 5) e em seguida apresente a soma e a diferença desses números.

import java.util.Scanner;

public class somaesub {
    public static void main(String[] args){
        System.out.print("Digite o primeiro número: ");
        Scanner entrada1 = new Scanner(System.in);
        int num1 = entrada1.nextInt();
        System.out.print("Digite o segundo número: ");
        Scanner entrada2 = new Scanner(System.in);
        int num2 = entrada2.nextInt();
        int soma = num1 + num2;
        System.out.print("A soma é igual a: "+soma);
        int subtracao = num1 - num2;
        System.out.print("\nA subtração é igual a: "+subtracao);
        entrada1.close();
        entrada2.close();
    }
}

