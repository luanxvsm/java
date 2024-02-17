import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializando as variáveis para contar as opiniões
        int otimo = 0;
        int bom = 0;
        int regular = 0;
        
        System.out.println("Digite 3 para ótimo, 2 para bom e 1 para regular");
        // Loop para receber as opiniões de 15 espectadores
        for (int i = 1; i <= 15; i++) {
            System.out.print("Opinião do espectador " + i + ": ");
            int opiniao = scanner.nextInt();

            // Verificando e contando as opiniões utilizando if e else
            if (opiniao == 3) {
                otimo++;
            } else if (opiniao == 2) {
                bom++;
            } else if (opiniao == 1) {
                regular++;
            } else {
                System.out.println("Opinião inválida. Por favor, insira 1, 2 ou 3.");
                i--; // Decrementa o índice para repetir a iteração atual
            }
        }

        // Exibindo os resultados
        System.out.println("\nResultados:");
        System.out.println("Ótimo: " + otimo + " espectadores");
        System.out.println("Bom: " + bom + " espectadores");
        System.out.println("Regular: " + regular + " espectadores");

        // Fechando o scanner
        scanner.close();
    }
}
