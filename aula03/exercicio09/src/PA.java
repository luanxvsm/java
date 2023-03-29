import java.util.Scanner;

public class PA {
    public void ExibirPA(){
        Scanner entrada =  new Scanner(System.in);
        System.out.print("Digite o número que vai ser o primeiro elemento da progressão: ");
        int numero = entrada.nextInt();
        Scanner entrada1 =  new Scanner(System.in);
        System.out.print("Digite a razão que você deseja para essa progressão: ");
        int razao = entrada1.nextInt();

        System.out.println("Os 10 primeiros elementos da progressão: ");
        for(int i=0; i < 10; i++){
            int progressao = numero + i * razao;
            System.out.print(progressao + " | ");
        }
        entrada.close();
        entrada1.close();
    }
}
