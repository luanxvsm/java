import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] vetor = new int[50];


        System.out.println("Vetor desordenado");
        for (int i = 0; i < vetor.length;i++){
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }


        System.out.println("Diga qual número deseja buscar: ");
        Scanner leitor = new Scanner(System.in);
        int buscador = leitor.nextInt();

        boolean encontrou = false;
        int contadorLinear = 0;
        for (int i = 0;i < vetor.length;i++){
            if (vetor[i] == buscador){
                encontrou = true;
                break;
            }else{
                contadorLinear += 1;
            }
        }
        if (encontrou == true){
            System.out.println("Encontrou");
        }else{
            System.out.println("Não encontrou");
        }

        System.out.println("Quantidade de iterações necessárias: "+ contadorLinear);

        int aux;
        int contadorBubble = 0;

        for (int i = 0;i < vetor.length; i ++){
            for (int j = i + 1;j < vetor.length;j++){
                if (vetor[i] > vetor[j]){
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }else{
                    contadorBubble += 1;
                }
            }

        }

        System.out.println("Quantidade de iterações necessárias: "+ contadorBubble);
        System.out.println("Vetor Ordenado");
        for (int i = 0; i < vetor.length;i++){
            System.out.println(vetor[i]);
        }


        // Busca binária
        System.out.println("Diga qual número deseja buscar: ");
        int buscador2 = leitor.nextInt();


        int contadorBinario = 0;
        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;


        while (fim >= inicio){
            meio = (int) (inicio+(fim - inicio) / 2);
            contadorBinario += 1;
            if (vetor[meio] == buscador2){
                achou = true;
                break;
            }else if(vetor[meio] < buscador2){
                inicio = meio + 1;

            }else{
                fim = meio - 1;
            }
        }


        System.out.println("Quantidade de iterações necessárias: "+ contadorBinario);
        if (achou == true){
            System.out.println("Achou!");
        }
        else{
            System.out.println("Não achou.");
        }
}
}
