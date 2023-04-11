import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        ArrayList<pessoa> Pessoas = new ArrayList<pessoa>();
        pessoa pessoa1 = new pessoa();
        pessoa pessoa2 = new pessoa();

        pessoa1.setNome("João");
        pessoa1.setIdade(18);
        pessoa2.setNome("Luan");
        pessoa2.setIdade(19);

        Pessoas.add(pessoa1);
        Pessoas.add(pessoa2);

        System.out.println("Nome da primeira pessoa: " + Pessoas.get(0).getNome());
        System.out.println("Idade da segunda pessoa: "+ Pessoas.get(1).getIdade());
    }
}
