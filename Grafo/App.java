public class App{

    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        grafo.lerArquivo();
        //System.out.println(grafo.numVertices());
        //System.out.println(grafo.numEdge());
        Prim prim = new Prim();
        prim.smorcPrim(grafo);
    }
}