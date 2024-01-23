import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int vetordesordenado[] = {88, 31, 96, 52, 45, 19, 68, 70, 29, 90};
        int vetorordenado[] = {19, 29, 31, 45, 52, 68, 70, 68, 70, 88, 90, 96};
        System.out.println("Qual valor deseja buscar? ");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        buscaLinear(n, vetordesordenado);
        buscaLinear(n, vetorordenado);
    }


private static void buscaLinear(int n, int[] vetor){
    boolean encontrou = false;
    int posicao = -1;

    for(int i = 0; i<vetor.length; i++){
        if (vetor[i] == n){
            encontrou = true;
            posicao = i;
    }
    if(encontrou){
        System.out.println("Encontrei o numero " +n+ " na"+ " posição"+ posicao);
    }else{
        System.out.println("Não encontrei esse numero no vetor");
    }
    }
}

private static void buscaBinaria(int n, int[] vetor){
    int inicio = 0;
    int fim = vetor.length;
    boolean encontrou = false;
    int posiçãomédia = -1;
    while(inicio <= fim){
        posiçãomédia = (inicio+fim)/2;
        if(posiçãomédia >= vetor.length || posiçãomédia<0){
            break;
        }
        if(n == vetor[posiçãomédia]){
            encontrou = true;
            break;
        }
        if(n<vetor[posiçãomédia]){
            fim = posiçãomédia-1;
        } else{
            inicio = posiçãomédia+1;
        }
    }
    if(encontrou){
        System.out.println("Encontrei o número "+n+" na posição "+posiçãomédia);
    }else{
        System.out.println("Não encontrei esse número no vetor");
    }
    }
}

