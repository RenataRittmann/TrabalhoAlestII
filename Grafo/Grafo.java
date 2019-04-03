import java.util.LinkedList;
import java.util.Scanner;

public class Grafo {
    private class Aresta {

    }

    private class Vertice {
        LinkedList vertices = new LinkedList<>();
    }
    
    public Grafo() {
        // alguma coisa aqui dentro
    }

    public void lerArquivo() {
        File arquivo = new File("Grafo.txt");
        Scanner leitor = new Scanner(arquivo);
        String[] vertices = leitor.next().split(",");
        while(leitor.hasNextLine()) {
            leitor.nextLine().split(",");
        }
    }

    public int numVertices() {
        int vertices = 0;
        return numero; 
    }

    public List vertices() {
        List vertices = new List<E>();
        return vertices; 
    }

    public int numEdge() {
        int arestas = 0;
        return arestas;
    }

    public List edges() {
        List arestas = new List<E>();
        return arestas;
    }

    public Aresta getEdge(Vertice u, Vertice v) {
        return null; 
        //retorna a aresta que se encontra entre os vertices passados por parametro
    }

    public Vertice endVertices(Aresta a) {
        return null; 
        //retorna os dois vertices (duas pontas) da aresta
    }

    public Vertice opposite(Vertice v, Aresta a) {
        Vertice outraPonta = new Vertice();
        return outraPonta;
    }

    public /*nao faço ideia*/ outDegree(Vertice v) {
        //return nao faço ideia
    }

    public /*nao faço ideia*/ inDegree(Vertice v) {
        //return nao faço ideia
    }
}