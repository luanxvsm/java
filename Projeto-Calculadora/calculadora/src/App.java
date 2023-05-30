import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Menu opsoes = new Menu();
        ArrayList<String> list = new ArrayList<String>();
        Adicao adcionar = new Adicao();
        subtra subtrair = new subtra();
        multipli multiplicar = new multipli();
        divi dividir = new divi();
        resto restar = new resto();

        while(true){
            System.out.print("digite um numero:");
            String num_str = entrada.nextLine();
            list.add(num_str);
            while(true){
                System.out.print("digite mais um numero:");
                String num_str1 = entrada.nextLine();
                list.add(num_str1);
                

                System.out.println("Quer continuar?[s/n]");
                String opc = entrada.nextLine();
                Boolean is_next = opc.equals("n");
                if(is_next){
                    break;
                }



            }

            opsoes.menu();
            System.out.print(">>>>");
            String ops = entrada.nextLine();
            switch (ops) {
                case "1":
                    double restado1 = adcionar.Adic(list);
                    System.out.println("Resultado: "+restado1);
                    break;
                case "2":
                    double restado2 = subtrair.Subt(list);
                    System.out.println("Resultado: "+restado2);
                    break;
                case "3":
                    double restado3 = multiplicar.multi(list);
                    System.out.println("Resultado: "+restado3);
                    break;
                case "4":
                    double restado4 = dividir.div(list);
                    System.out.println("Resultado: "+restado4);
                    break;
                case "5":
                    double restado5 = restar.rest(list);
                    System.out.println("Resultado: "+restado5);
                    break;
                default:
                    break;
            }

        }

    }
}
