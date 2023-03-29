import java.util.Scanner;

public class carro implements caracteristicas{
    public void ExibirNome(){
        System.out.print("Qual o nome do carro? ");
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        System.out.print(nome);

    }
    public void ExibirMarca(){
        System.out.print("\nQual a marca do carro? ");
        Scanner entrada2 = new Scanner(System.in);
        String marca = entrada2.nextLine();
        System.out.print(marca);

    }
    public void ExibirModelo(){
        System.out.print("\nQual o modelo do carro? ");
        Scanner entrada3 = new Scanner(System.in);
        String modelo = entrada3.nextLine();
        System.out.print(modelo);

    }
}
