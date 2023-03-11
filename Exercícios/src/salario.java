// 7)Faça um programa que recebe o nome de um funcionário, o número de horas trabalhadas e o valor que recebe por hora. Com estas informações, calcular o salário deste funcionário e exibir seu nome e salário final.

import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        System.out.print("Qual seu nome? ");
        Scanner entrada1 = new Scanner(System.in);
        String nome = entrada1.nextLine(); 
        System.out.print("Quantas horas você trabalha por mês? ");
        Scanner entrada2 = new Scanner(System.in);
        int horas = entrada2.nextInt();
        System.out.print("Quanto você ganha por hora trabalhada? ");
        Scanner entrada3 = new Scanner(System.in);
        float salario = entrada3.nextFloat();
        float salarioFinal = salario * horas;
        System.out.print("-----------------------------");
        System.out.print("\nFuncionário(a): "+nome);
        System.out.print("\nSalário total: R$"+salarioFinal);
        System.out.print("\n-----------------------------");
        entrada1.close();
        entrada2.close();
        entrada3.close();
    }
}
