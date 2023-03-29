// 6)Faça um programa que receba 3 notas de um aluno(em variáveis do tipo String, utilizando o método nextLine() ou next() ) e calcule sua média.

import java.util.Scanner;

public class media {
    public static void main(String[] args){
        System.out.print("Informe sua primeira nota: ");
        Scanner entrada1 = new Scanner(System.in);
        String nota1 = entrada1.nextLine();
        System.out.print("Informe sua segunda nota: ");
        Scanner entrada2 = new Scanner(System.in);
        String nota2 = entrada2.nextLine();
        System.out.print("Informe sua terceira nota: ");
        Scanner entrada3 = new Scanner(System.in);
        String nota3 = entrada3.nextLine();
        
        float n1 = Float.parseFloat(nota1);
        float n2 = Float.parseFloat(nota2);
        float n3 = Float.parseFloat(nota3);
    
        float soma = n1+n2+n3;
        float mediaGeral = soma / 3;

        System.out.print("A sua média geral é igual a: "+mediaGeral);
        entrada1.close();
        entrada2.close();
        entrada3.close();
    }
}
