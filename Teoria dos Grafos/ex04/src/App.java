public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {1, 2, 7, 9, 66};
        System.out.println("Soma dos positivos: " + somaPositivos(numeros));
    }
    private static int somaPositivos(int[] numeros){
        int soma = 0;

        for(int i = 0; i< numeros.length; i++){
            if(numeros[i] > 0){
                soma += numeros[i];
            }
        }
        return soma;
    }
}
