// 2)Faça um programa que recebe o ano de nascimento e retorne a idade do usuário.

import java.util.Scanner;

public class idade {
    public static void main(String[] args){
        System.out.print("Qual seu ano de nascimento? ");
        Scanner entrada = new Scanner(System.in);
        String ano = entrada.nextLine();
        float nascimento = Float.parseFloat(ano);
        float idade = 2023 - nascimento;
        System.out.printf("Sua idade é %.0f", (idade));
        entrada.close();
    }
}
