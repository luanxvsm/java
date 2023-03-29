abstract class imovel {
    String Endereco;
    double area;
    int numQuartos;
    double preco;

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getEndereco() {
        return Endereco;
    }

    public double getArea() {
        return area;
    }

    public int getNumQuartos(){
        return numQuartos;
    }

    public double getPreco() {
        return preco;
    }
}
