public class App {
    public static void main(String[] args) throws Exception {
        Grafo grafo = new Grafo();

        Vertice v1 = new Vertice(1);
        Vertice v2 = new Vertice(2);
        Vertice v3 = new Vertice(3);

        grafo.addVertice(v1);
        grafo.addVertice(v2);
        grafo.addVertice(v3);

        grafo.addAresta(v1, v2, 3);
        grafo.addAresta(v2, v3, 5);
        grafo.addAresta(v3, v1, 2);

        // Exemplo de como percorrer as arestas de um vértice
        for (Aresta aresta : v1.arestas) {
            System.out.println("Aresta de " + aresta.inicio.id + " para " + aresta.fim.id + " com peso " + aresta.peso);
        }
    }
}
