import java.util.Arrays;

class Professor {
    String nome;

    public Professor(String nome) {
        this.nome = nome;
    }
}

class TabelaHash {
    private Professor[] tabela;
    private int tamanho;

    public TabelaHash(int tamanho) {
        this.tamanho = tamanho;
        this.tabela = new Professor[tamanho];
    }

    public int hash(String chave) {
        return chave.length() % tamanho;
    }

    public void inserir(Professor professor) {
        int posicao = hash(professor.nome);

        while (tabela[posicao] != null) {
            // Tratamento de colisões pelo método do teste linear
            posicao = (posicao + 1) % tamanho;
        }

        tabela[posicao] = professor;
    }

    public void imprimir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Sala " + i + ": " + (tabela[i] != null ? tabela[i].nome : "Vazia"));
        }
    }
}

public class principal {
    public static void main(String[] args) {
        TabelaHash tabelaHash = new TabelaHash(7);

        Professor professor1 = new Professor("Joao");
        Professor professor2 = new Professor("Maria");
        Professor professor3 = new Professor("Carlos");
        Professor professor4 = new Professor("Ana");
        Professor professor5 = new Professor("Pedro");
        Professor professor6 = new Professor("Luiza");

        tabelaHash.inserir(professor1);
        tabelaHash.inserir(professor2);
        tabelaHash.inserir(professor3);
        tabelaHash.inserir(professor4);
        tabelaHash.inserir(professor5);
        tabelaHash.inserir(professor6);

        tabelaHash.imprimir();
    }
}

