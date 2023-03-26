import java.util.Scanner;

public class cd extends produto{
    int numFaixas;
    public void exibeInformacoes(){
        setNome(nome);
        setPreco(preco);
    }

    public void getInformacoes(){
        
    }

    public void ExibirFaixas(){
        System.out.println("Quantas faixas tem o CD? ");
        Scanner entrada = new Scanner(System.in);
        numFaixas = entrada.nextInt();
        System.out.print(numFaixas);
    }
}
