import java.util.Scanner;

public class apartamento extends imovel{
    int numApartamento;
    int andar;
    final Scanner entrada = new Scanner(System.in);

    public void exibePreco(){
        System.out.println(Endereco);
        System.out.println(area);
        System.out.println(numQuartos);
        System.out.println(preco);
        System.out.println(numApartamento);
        System.out.println(andar);
    }

    public void getValor(){
        System.out.print("Qual o endereço do imovel? ");
        String endereco1 = entrada.nextLine();
        setEndereco(endereco1);

        System.out.print("Qual a área do imovel? ");
        double area1 = entrada.nextDouble();
        setArea(area1);

        System.out.print("Quantos quartos tem o imóvel? ");
        int quartos = entrada.nextInt();
        setNumQuartos(quartos);

        System.out.println("Qual é o preço do imóvel? ");
        double valor = entrada.nextDouble();
        setPreco(valor);

        System.out.println("Qual o número do apartamento? ");
        this.numApartamento = entrada.nextInt();

        System.out.println("Qual o andar do apartamento? ");
        this.andar = entrada.nextInt();

        entrada.close();
    }
}
