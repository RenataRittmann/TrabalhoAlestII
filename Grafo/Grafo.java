import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Grafo {

    class Aresta {
        private final double peso;
        private final Vertice inicio;
        private final Vertice fim;

        public Aresta(double peso, Vertice string, Vertice string2) {
            this.peso = peso;
            this.inicio = string;
            this.fim = string2;
        }

        public Vertice getVerticeInicio() {
            return inicio;
        }

        public Vertice getVerticeFim() {
            return fim;
        }

        public double getPeso() {
            return peso;
        }

    }

    class Vertice{
        private String nome;

        public Vertice(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }
        public String toString(){
            return nome;
        }
        @Override
        public boolean equals(Object outro){
            if(outro == null){
                return false;
            }if(!(outro instanceof Vertice)){
                return false;
            }
            Vertice o = (Vertice) outro;
            
            return this.getNome().equals(o.getNome());
        }
        @Override
        public int hashCode(){
            return this.getNome().hashCode();
        }
    }

    private List<Vertice> vertices;
    private List<Aresta> arestas;

    public Grafo() {
        vertices = new LinkedList<>();
        arestas = new LinkedList<>();
    }

    public void lerArquivo() {
        File arquivo = new File("GrafoTeste.txt");
        try {
            Scanner leitor = new Scanner(arquivo);
            String[] vs = leitor.nextLine().split(",");
            for (int i = 0; i < vs.length; i++) {
                addVertice(new Vertice(vs[i]));
            }
            while (leitor.hasNextLine()) {
                String[] aresta = leitor.nextLine().split(",");
                addAresta(new Aresta(Double.parseDouble(aresta[2]), new Vertice(aresta[0]), new Vertice(aresta[1])));
                //comentar para tornar o grafo direcionado
                addAresta(new Aresta(Double.parseDouble(aresta[2]), new Vertice(aresta[1]), new Vertice(aresta[0])));
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int numVertices() {
        return vertices.size();
    }

    public List<Vertice> vertices() {
        return vertices;
    }

    public int numEdge() {
        return arestas.size()/2;
        // não direcionado dividir por 2
    }

    public List<Aresta> edges() {
        return arestas;
    }

    public Aresta getEdge(Vertice u, Vertice v) {
        for (Aresta aresta : arestas) {
            if (u.equals(aresta.getVerticeInicio()) && v.equals(aresta.getVerticeFim()))
                return aresta;
        }
        return null;
    }

    public Vertice endVertices(Aresta a) {
        return a.getVerticeFim();
    }

    public Vertice opposite(Vertice v, Aresta a) {
        return a.getVerticeFim();
    }

    public void addVertice(Vertice v) {
        vertices.add(v);
    }

    public void addAresta(Aresta a) {
        arestas.add(a);
    }

    public int outDegree(Vertice v) {
        int count = 0;
        for (Aresta aresta : arestas) {
            if (aresta.getVerticeInicio().equals(v))
                count++;
        }
        return count;
    }

    public int inDegree(Vertice v) {
        int count = 0;
        for (Aresta aresta : arestas) {
            if (aresta.getVerticeFim().equals(v))
                count++;
        }
        return count;
    }


}