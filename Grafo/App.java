public class App{

    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        grafo.lerArquivo();
        grafo.escreveArquivo("Grafo.txt");
        Prim prim = new Prim();
        prim.smorcPrim(grafo).escreveArquivo("GrafoPrim.txt");
    }
}