import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        int a, b, divisao, resto;
        String entrada;
        entrada = JOptionPane.showInputDialog("Informe um número inteiro: ");
        a = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog("Informe outro número inteiro: ");
        b = Integer.parseInt(entrada);
        divisao = a/b;
        resto = a%b;
        JOptionPane.showMessageDialog(null, "a/b = " + divisao);
        JOptionPane.showMessageDialog(null, "a%b = " + resto);
    }
}
