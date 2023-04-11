import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        ArrayList<jogador> times = new ArrayList<jogador>();

        for(int i=0; i<3; i++){
            jogador time = new jogador();
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o seu nome: ");
            time.setNome(entrada.nextLine());
            System.out.println("Digite a altura: ");
            time.setAltura(entrada.nextDouble());
            System.out.println("Digite o numero da sua camisa");
            time.setNumCamisa(entrada.nextInt());
            System.out.println("Digite o seu peso: ");
            time.setPeso(entrada.nextDouble());
            System.out.println("Digite a sua posição: ");
            entrada.nextLine();
            time.setPosicao(entrada.nextLine());

            times.add(time);
        }

        for(int j=0; j<3; j++){
            System.out.println(j);
            System.out.println("O seu nome é: "+times.get(j).getNome());
            System.out.println("A sua altura: "+times.get(j).getAltura());
            System.out.println("O seu peso é: "+times.get(j).getPeso());
            System.out.println("O seu número na camisa é: "+times.get(j).getNumCamisa());
            System.out.println("A sua posição: "+times.get(j).getPosicao());
        }
        for (int g = 0; g < times.size()-1; g++) {
            for (int i = 0; i < times.size()-1; i++) {
                if(times.get(i) == times.get(g)){
                    times.remove(i);
                }
            }
        }
    }
}
