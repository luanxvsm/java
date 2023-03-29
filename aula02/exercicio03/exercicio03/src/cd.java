import java.util.Scanner;

public class cd extends produto {
    int numFaixas;
    final Scanner entrada = new Scanner(System.in);

    public void exibeInformacoes() {
        System.out.println(nome);
        System.out.println(preco);
        System.out.println(numFaixas);
    }

    public void getInfo() {
        System.out.print("Qual nome do album? ");
        String nome1 = entrada.nextLine();
        setNome(nome1);

        System.out.println("Quantas faixas tem o CD? ");
        this.numFaixas = entrada.nextInt();

        System.out.println("Qual é o preço? ");
        double valor = entrada.nextDouble();
        setPreco(valor);

        entrada.close();

    }
}

