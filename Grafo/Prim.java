import java.util.LinkedList;
import java.util.List;

public class Prim {
    public Prim() {

    }
    public Grafo smorcPrim(Grafo g) {

        List<Grafo.Vertice> visitados = new LinkedList<>();
        List<Grafo.Vertice> naoVisitados = g.vertices();
        Grafo t = new Grafo();
        visitados.add(g.vertices().get(0));
        naoVisitados.remove(g.vertices().get(0));
        Grafo.Aresta resp = g.edges().get(0);

        while (naoVisitados.size() > 0) {
            
            double menor = 999;
            for (int j = 0; j < g.edges().size(); j++) {

                Grafo.Aresta atual = g.edges().get(j);
                if (visitados.contains(atual.getVerticeInicio()) && naoVisitados.contains(atual.getVerticeFim())
                        && atual.getPeso() < menor) {

                    menor = atual.getPeso();
                    resp = atual;
                }
            }
            visitados.add(resp.getVerticeFim());
            naoVisitados.remove(resp.getVerticeFim());
            t.addAresta(resp);
            
        }
        return t;
    }

}