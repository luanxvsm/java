import java.io.IOException;


public class App {
    public static void main(String[] args){
        String frase = "Luan";
        String novaFrase = null;
        try{
            novaFrase = frase.toUpperCase();
        }
        catch(NullPointerException e){
            System.out.println("A frase inicial está nula, para solucionar tal problema, foi lhe atribuido um valor default.");
            frase = "Frase vazia";
        }
        finally{
            novaFrase = frase.toUpperCase();
        }
        System.out.println("Frase antiga: "+frase);
        System.out.println("Frase nova: "+novaFrase);
    }
}
