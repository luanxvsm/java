import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "/arquivo-texto/file.txt";
        ManipularArquivo func = new ManipularArquivo();
        ArrayList<String> lista = new ArrayList<String>();

        Menu cardapio = new Menu();
        Scanner teclado = new Scanner(System.in);
        Arvore arvore = new Arvore();

        lista = func.leitor(path);
        String rgmAndNome[][] = new String[lista.size()][2];
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) != "") {
                rgmAndNome[i][0] = lista.get(i).split(" ")[0];
                rgmAndNome[i][1] = lista.get(i).split(" ")[1];

            }

        }
        for (String[] strings : rgmAndNome) {
            if ((strings[0] != null) && (strings[1] != null)) {
                arvore = arvore.inserir(new Elemento(Integer.parseInt(strings[0]), strings[1]));
                arvore.calcularBalanceamento();
                arvore = arvore.verificaBalanceamento();
            }
        }
        while (true) {
            cardapio.MenuPrincipal();
            System.out.print(">>>> ");
            int ops = teclado.nextInt();
            teclado.nextLine();
            switch (ops) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = teclado.nextLine();

                    System.out.print("Digite o RGM: ");
                    int RGM = teclado.nextInt();

                    arvore = arvore.inserir(new Elemento(RGM, nome));
                    arvore.calcularBalanceamento();
                    arvore = arvore.verificaBalanceamento();
                    break;
                case 2:
                    System.out.print("Digite o RGM: ");
                    int RGM_remove = teclado.nextInt();

                    if (arvore.busca(RGM_remove)) {
                        Arvore arvore_remove = arvore.remover(new Elemento(RGM_remove, "nome"));
                        arvore_remove.printArvore(0);
                    } else {
                        cardapio.ElementoNaoEncotrado();
                    }
                    break;
                case 3:

                    System.out.print("Digite o RGM: ");
                    int RGM_busca = teclado.nextInt();

                    if (arvore.busca(RGM_busca)) {
                        cardapio.ElementoEncotrado();
                    } else {
                        cardapio.ElementoNaoEncotrado();
                    }
                    break;

                case 4:
                    arvore.esvaziarEmPosOrdem();

                    break;

                case 5:
                    cardapio.MenuSegundario();
                    System.out.print(">>>> ");
                    int ops1 = teclado.nextInt();
                    switch (ops1) {
                        case 1:
                            arvore.imprimirPreOrdem();
                            break;
                        case 2:
                            arvore.imprimirInOrdem();

                            break;
                        case 3:
                            arvore.imprimirPosOrdem();
                            break;
                        case 4:
                            arvore.imprimirPosOrdem();
                            break;

                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
            System.out.println("-----------------------------");
        }
    }
}
