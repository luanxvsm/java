
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ManipularArquivo {

    public static ArrayList leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        ArrayList<String> list = new ArrayList<String>();
        String linha = "";
        while (true) {
            if (linha != null) {
                list.add(linha);

            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
        return list;
    }

    public static void escritor(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        linha = in.nextLine();
        buffWrite.append(linha + "\n");
        buffWrite.close();
    }

}
