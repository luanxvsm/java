public class Atributos {
    private String nome;
    private int quantEstoque;
    private double valor;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getQuantEstoque() {
        return quantEstoque;
    }
    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }
    
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void imprimir(){
        System.out.printf("Nome: %s\n", getNome());
        System.out.printf("Quantidade: %d\n", getQuantEstoque());
        System.out.print("Valor: R$"+ getValor());
    }
}
