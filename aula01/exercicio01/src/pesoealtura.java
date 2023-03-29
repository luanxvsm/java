// 3)Faça um programa que pergunte o peso e a altura do usuário em seguida apresente os valores perguntados.

import java.util.Scanner;

public class pesoealtura {
    public static void main(String[] args){
        System.out.print("Informe seu peso: ");
        Scanner entrada1 = new Scanner(System.in);
        float peso = entrada1.nextFloat();
        System.out.print("Informe sua altura: ");
        Scanner entrada2 = new Scanner(System.in);
        float altura = entrada2.nextFloat();
        System.out.printf("Peso: %.0f\nAltura: %.2f", (peso), (altura));
        entrada1.close();
        entrada2.close();
    }
}
