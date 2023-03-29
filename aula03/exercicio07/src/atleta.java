import java.util.Scanner;

public class atleta {
    public void ExibirIdade(){
        System.out.println("Digite sua idade: ");
        Scanner entrada = new Scanner(System.in);
        int idade = entrada.nextInt();

        if(idade >= 5 && idade <= 10){
            System.out.printf("Você tem %d anos e está na categoria infantil", idade);
        } else if(idade >= 11 && idade <= 15){
            System.out.printf("Você tem %d anos e está na categoria juvenil", idade);
        } else if(idade >= 16 && idade <= 20){
            System.out.printf("Você tem %d anos e está na categoria Júnior", idade);
        } else if(idade >= 21 && idade <= 25){
            System.out.printf("Você tem %d anos e está na categoria Profissional", idade);
        } else {
            System.out.println("Você não tem idade para estar em nenhuma categoria");
        }

        entrada.close();
    }
}
