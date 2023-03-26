// 1)Faça um programa que pergunte o nome e em seguida mostre as informações para o usuário.

import java.util.Scanner;

public class printarnome{
    public static void main(String[] args){
        System.out.print("Qual é o seu nome? ");
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        System.out.println(nome);
        System.out.print("Meu nome é "+nome);
        entrada.close();
    }

}