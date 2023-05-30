import javax.swing.JOptionPane;

public class App {
    public static void main(String args[]){
        String nomes[] = new String[2]; //tamanho = 2
        nomes[0] = "José";
        nomes[1] = "Maria";
        int indice;
        String entrada = JOptionPane.showInputDialog("Informe o indice");
        indice = Integer.parseInt(entrada);
        System.out.println(nomes[indice]);
    }
}
