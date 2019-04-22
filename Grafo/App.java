public class App{

    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        grafo.lerArquivo();
        //grafo.escreveArquivoDot("Grafo.dot");
        Prim prim = new Prim();
        prim.smorcPrim(grafo).escreveArquivoDot("GrafoPrim.dot");
    }
}