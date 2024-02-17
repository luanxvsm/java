import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        // Vetores A1 e A2 já ordenados
        int[] A1 = {1, 3, 5, 7, 9};
        int[] A2 = {2, 4, 6, 8, 10};

        // Tamanho dos vetores A1 e A2
        int X = A1.length;
        int Y = A2.length;

        // Vetor A3 terá tamanho igual à soma dos tamanhos de A1 e A2
        int[] A3 = new int[X + Y];

        // Índices para percorrer os vetores A1, A2 e A3
        int i = 0, j = 0, k = 0;

        // Transferência ordenada dos valores de A1 e A2 para A3
        while (i < X && j < Y) {
            if (A1[i] < A2[j]) {
                A3[k++] = A1[i++];
            } else {
                A3[k++] = A2[j++];
            }
        }

        // Transferindo os elementos restantes de A1 (se houver)
        while (i < X) {
            A3[k++] = A1[i++];
        }

        // Transferindo os elementos restantes de A2 (se houver)
        while (j < Y) {
            A3[k++] = A2[j++];
        }

        // Exibindo o vetor A3 ordenado
        System.out.println("Vetor A3 ordenado: " + Arrays.toString(A3));
    }
}

