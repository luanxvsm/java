import java.util.ArrayList;
import java.util.List;

public class Vertice {
    int id;
    List<Aresta> arestas;

    public Vertice(int id) {
        this.id = id;
        this.arestas = new ArrayList<>();
    }

    public void addAresta(Aresta aresta) {
        arestas.add(aresta);
    }
}
