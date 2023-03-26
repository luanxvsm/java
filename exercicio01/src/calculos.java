// 5)Faça um programa que recebe dois números digitados pelo usuário e calcule a soma, subtração, multiplicação e divisão entre os números. Exiba as respostas no final do processamento.

import java.util.Scanner;

public class calculos {
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
        int multi = num1 * num2;
        System.out.print("\nA multiplicação é igual a: "+multi);
        float divisao = num1 / num2;
        System.out.print("\nA divisão é igual a: "+divisao);
        entrada1.close();
        entrada2.close();
    }
}
