import java.util.ArrayList;
import java.util.List;

public class Grafo {
    List<Vertice> vertices;

    public Grafo() {
        this.vertices = new ArrayList<>();
    }

    public void addVertice(Vertice vertice) {
        vertices.add(vertice);
    }

    public void addAresta(Vertice inicio, Vertice fim, int peso) {
        Aresta aresta = new Aresta(inicio, fim, peso);
        inicio.addAresta(aresta);
    }
}
