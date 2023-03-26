import java.util.Scanner;

public class livro extends produto{
    String autor;
    public void ExibirAutor(){
        System.out.println("Qual o nome do autor? ");
        Scanner entrada = new Scanner(System.in);
        autor = entrada.nextLine();
        System.out.print(autor);
    }
}