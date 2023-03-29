import java.util.Scanner;

public class moto extends categoria{
    public void ExibirNome(){
        System.out.print("\nQual o nome da moto? ");
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        System.out.print(nome);

    }
    public void ExibirMarca(){
        System.out.print("\nQual a marca da moto? ");
        Scanner entrada2 = new Scanner(System.in);
        String marca = entrada2.nextLine();
        System.out.print(marca);

    }
    public void ExibirModelo(){
        System.out.print("\nQual o modelo da moto? ");
        Scanner entrada3 = new Scanner(System.in);
        String modelo = entrada3.nextLine();
        System.out.print(modelo);

    }
}
