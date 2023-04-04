public class App {
    public static void main(String[] args) throws Exception {
        int[][] p = new int[10][];
        for(int i = 0; i<10; i++){
            p[i] = new int[i+1];
        }
        for(int i = 0; i<10; i++){
            p[i][0] = 1;
            p[i][i] = 1;
            for(int j = 1; j<i; j++){
                p[i][j] = p[i-1][j-1]+p[i-1][j];
            }
        }
        for(int j = 0; j<10; j++){
            for(int i = 1; i<j; i++){
                System.out.printf("  %d  ", p[j][i]);
            }
            System.out.printf("\n");
        }
    }
}
