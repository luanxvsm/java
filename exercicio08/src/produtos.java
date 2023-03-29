import java.util.Scanner;

public class produtos {
    public void ExibirPreco(){
        while(true){
            System.out.println("Digite o código do produto: ");
            Scanner entrada = new Scanner(System.in);
            int codigo = entrada.nextInt();

            System.out.println("Digite a quantidade adquirida do produto: ");
            Scanner entrada2 = new Scanner(System.in);
            int quantidade = entrada2.nextInt();

            if(codigo == 0){
                break;
            }

            if(codigo == 1){
                System.out.println("Caderno - R$12,00");
                int valor;
                valor = 12 * quantidade;
                System.out.printf("O total a ser pago é: %d\n", valor);
            } else if(codigo == 2){
                System.out.println("Régua - R$2,50");
                double valor;
                valor = 2.5 * quantidade;
                System.out.printf("O total a ser pago é: %.2f\n", valor);
            } else if(codigo == 3){
                System.out.println("Borracha - R$0,25");
                double valor;
                valor = 0.25 * quantidade;
                System.out.printf("O total a ser pago é: %.2f\n", valor);
            } else if(codigo == 4){
                System.out.println("Mochila - R$50,00");
                int valor;
                valor = 50 * quantidade;
                System.out.printf("O total a ser pago é: %d\n", valor);
            } else{
                System.out.println("Código inválido");
                break;
            }
        }
    }
}
